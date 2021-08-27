#include "Pilha_int.h"
#include <iostream>

Pilha_int inicializa_int(){
    Pilha_int pilha;
    pilha.Topo = 0;
    return pilha;
}

void FPVazia(Pilha_int *Pilha){
    Pilha->Topo = 0;
}

int Vazia(Pilha_int *Pilha){
    return (Pilha->Topo == 0);
}

void Empilha(char x, Pilha_int *Pilha){
    if (Pilha->Topo == MAXTAM){
        printf("Pilha cheia\n");
    } else{
        Pilha->Item[Pilha->Topo] = x;
        Pilha->Topo++;
    }
}

char Desempilha(Pilha_int *Pilha){
    if (Vazia(Pilha)){
        char bug;
        printf("Pilha vazia\n");
        return bug;
    } else {
        Pilha->Topo--;
        return Pilha->Item[Pilha->Topo];
    }
}

int Tamanho(Pilha_int *Pilha){
    return Pilha->Topo;
}