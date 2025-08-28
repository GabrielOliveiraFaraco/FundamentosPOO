import random

listaUsuario = ["azul", "amarelo", "vermelho", "verde"]
listaResposta = ["azul", "amarelo", "vermelho", "verde"]

random.shuffle(listaUsuario)
random.shuffle(listaResposta)

quantidadeAcertos = 0
while quantidadeAcertos < 4:
    posicao = 0
    for cor in listaUsuario:
        print(f"Posição {posicao} - {cor}")
        posicao += 1
        
    posicao1 = int(input("\nDigite a posição da primeira cor que você quer trocar: "))
    posicao2 = int(input("\nDigite a posição da segunda cor que você quer trocar:"))
    
    if posicao1 >= 0 and posicao1 < 4 and posicao2 >= 0 and posicao2 < 4 and posicao1 != posicao2:
        cor1 = listaUsuario[posicao1]
        cor2 = listaUsuario[posicao2]
        
        listaUsuario[posicao1] = cor2
        listaUsuario[posicao2] = cor1
    
    idx = 0
    for i in listaUsuario:
        if i == listaResposta[idx]:
            quantidadeAcertos += 1
        idx +=1
    print(f"Você tem {quantidadeAcertos} acertos!")

print("Você venceu!")