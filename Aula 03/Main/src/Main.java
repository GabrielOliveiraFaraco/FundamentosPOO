class MMORPG
{
    public String classes;
    public String armaduras;
    public String armas;
    
    public void printar()
    {
        System.out.println("A classe é: " + this.classes + "\n" + "A armadura é: " + this.armaduras + "\n" + "A arma é: " + this.armas);
    }
}

public class Main
{
    public static void main(String[] args){
        MMORPG albionOnline = new MMORPG();
        
        albionOnline.classes = "Arqueiro";
        albionOnline.armaduras = "Couro";
        albionOnline.armas = "Arco";
        
        albionOnline.printar();
    }
}
