#include "Pilha_char.h"
#include <iostream>

Pilha_char inicializa(){
    Pilha_char pilha;
    pilha.Topo = 0;
    return pilha;
}

void FPVazia(Pilha_char *Pilha){
    Pilha->Topo = 0;
}

int Vazia(Pilha_char *Pilha){
    return (Pilha->Topo == 0);
}

void Empilha(char x, Pilha_char *Pilha){
    if (Pilha->Topo == MAXTAM){
        printf("Pilha cheia\n");
    } else{
        Pilha->Item[Pilha->Topo] = x;
        Pilha->Topo++;
    }
}

char Desempilha(Pilha_char *Pilha){
    if (Vazia(Pilha)){
        char bug;
        printf("Pilha vazia\n");
        return bug;
    } else {
        Pilha->Topo--;
        return Pilha->Item[Pilha->Topo];
    }
}

int Tamanho(Pilha_char *Pilha){
    return Pilha->Topo;
}