import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SimpleMinecraft extends JPanel implements KeyListener, MouseListener, MouseMotionListener {
    
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int BLOCK_SIZE = 40;
    private static final int GRID_WIDTH = 20;
    private static final int GRID_HEIGHT = 15;
    
    private int playerX = WIDTH / 2;
    private int playerY = HEIGHT / 2;
    private int playerSize = 30;
    
    private int[][] world;
    private Random random;
    
    private int selectedBlock = 1; // 0: ar, 1: terra, 2: pedra, 3: madeira
    private boolean showGrid = true;
    
    public SimpleMinecraft() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.CYAN);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        setFocusable(true);
        
        random = new Random();
        generateWorld();
    }
    
    private void generateWorld() {
        world = new int[GRID_WIDTH][GRID_HEIGHT];
        
        // Gerar terreno básico
        for (int x = 0; x < GRID_WIDTH; x++) {
            for (int y = GRID_HEIGHT / 2; y < GRID_HEIGHT; y++) {
                if (y == GRID_HEIGHT / 2) {
                    world[x][y] = 1; // Terra na superfície
                } else if (y < GRID_HEIGHT / 2 + 3) {
                    world[x][y] = 2; // Pedra abaixo da terra
                } else {
                    world[x][y] = 3; // Madeira mais abaixo
                }
            }
        }
        
        // Adicionar algumas árvores
        for (int i = 0; i < 5; i++) {
            int treeX = random.nextInt(GRID_WIDTH);
            int treeY = (GRID_HEIGHT / 2) - 1;
            if (treeY >= 0) {
                world[treeX][treeY] = 3; // Tronco da árvore
            }
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Desenhar o mundo
        for (int x = 0; x < GRID_WIDTH; x++) {
            for (int y = 0; y < GRID_HEIGHT; y++) {
                int blockType = world[x][y];
                if (blockType != 0) { // Não desenhar ar
                    int screenX = x * BLOCK_SIZE;
                    int screenY = y * BLOCK_SIZE;
                    
                    switch (blockType) {
                        case 1: // Terra
                            g.setColor(new Color(139, 69, 19)); // Marrom
                            break;
                        case 2: // Pedra
                            g.setColor(Color.GRAY);
                            break;
                        case 3: // Madeira
                            g.setColor(new Color(160, 82, 45)); // Sienna
                            break;
                        default:
                            g.setColor(Color.WHITE);
                    }
                    
                    g.fillRect(screenX, screenY, BLOCK_SIZE, BLOCK_SIZE);
                    
                    // Bordas dos blocos
                    if (showGrid) {
                        g.setColor(Color.BLACK);
                        g.drawRect(screenX, screenY, BLOCK_SIZE, BLOCK_SIZE);
                    }
                }
            }
        }
        
        // Desenhar jogador
        g.setColor(Color.BLUE);
        g.fillRect(playerX - playerSize/2, playerY - playerSize/2, playerSize, playerSize);
        
        // Desenhar informações na tela
        g.setColor(Color.BLACK);
        g.drawString("Use WASD para mover, 1-4 para selecionar blocos, G para grid: " + showGrid, 10, 20);
        g.drawString("Bloco selecionado: " + getBlockName(selectedBlock), 10, 40);
        g.drawString("Clique para colocar/remover blocos", 10, 60);
    }
    
    private String getBlockName(int blockType) {
        switch (blockType) {
            case 0: return "Ar";
            case 1: return "Terra";
            case 2: return "Pedra";
            case 3: return "Madeira";
            default: return "Desconhecido";
        }
    }
    
    private void placeBlock(int mouseX, int mouseY) {
        int gridX = mouseX / BLOCK_SIZE;
        int gridY = mouseY / BLOCK_SIZE;
        
        if (gridX >= 0 && gridX < GRID_WIDTH && gridY >= 0 && gridY < GRID_HEIGHT) {
            world[gridX][gridY] = selectedBlock;
            repaint();
        }
    }
    
    private void removeBlock(int mouseX, int mouseY) {
        int gridX = mouseX / BLOCK_SIZE;
        int gridY = mouseY / BLOCK_SIZE;
        
        if (gridX >= 0 && gridX < GRID_WIDTH && gridY >= 0 && gridY < GRID_HEIGHT) {
            world[gridX][gridY] = 0; // Ar
            repaint();
        }
    }
    
    // Implementação dos métodos de interface
    @Override
    public void keyPressed(KeyEvent e) {
        int speed = 5;
        
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W:
                playerY -= speed;
                break;
            case KeyEvent.VK_S:
                playerY += speed;
                break;
            case KeyEvent.VK_A:
                playerX -= speed;
                break;
            case KeyEvent.VK_D:
                playerX += speed;
                break;
            case KeyEvent.VK_1:
                selectedBlock = 1;
                break;
            case KeyEvent.VK_2:
                selectedBlock = 2;
                break;
            case KeyEvent.VK_3:
                selectedBlock = 3;
                break;
            case KeyEvent.VK_0:
                selectedBlock = 0;
                break;
            case KeyEvent.VK_G:
                showGrid = !showGrid;
                break;
        }
        
        // Limitar jogador dentro da tela
        playerX = Math.max(playerSize/2, Math.min(WIDTH - playerSize/2, playerX));
        playerY = Math.max(playerSize/2, Math.min(HEIGHT - playerSize/2, playerY));
        
        repaint();
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) { // Botão esquerdo
            placeBlock(e.getX(), e.getY());
        } else if (e.getButton() == MouseEvent.BUTTON3) { // Botão direito
            removeBlock(e.getX(), e.getY());
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e) {
        if ((e.getModifiersEx() & MouseEvent.BUTTON1_DOWN_MASK) != 0) { // Arrastar com botão esquerdo
            placeBlock(e.getX(), e.getY());
        } else if ((e.getModifiersEx() & MouseEvent.BUTTON3_DOWN_MASK) != 0) { // Arrastar com botão direito
            removeBlock(e.getX(), e.getY());
        }
    }
    
    // Métodos não utilizados (mas necessários para as interfaces)
    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}
    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Minecraft");
        SimpleMinecraft game = new SimpleMinecraft();
        
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        // Focar no painel para receber eventos de teclado
        game.requestFocusInWindow();
    }
}