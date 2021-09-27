#include <iostream>
#include "Pilha.h"

using namespace std;

TipoPilha inicializa(){
    TipoPilha pilha;
    FPVazia(&pilha);
    return pilha;
}

void FPVazia(TipoPilha *Pilha){
    Pilha->Topo = (Apontador) malloc(sizeof(Celula));
    Pilha->Fundo = Pilha->Topo;
    Pilha->Topo->Prox = NULL;
    Pilha->Tamanho = 0;
}

int Vazia(TipoPilha *Pilha){
    return (Pilha->Topo == Pilha->Fundo);
}

void Empilha(TipoItem x, TipoPilha *Pilha){
    Apontador aux;
    aux = (Apontador) malloc(sizeof(Celula));
    Pilha->Topo->Item = x;
    aux->Prox = Pilha->Topo;
    Pilha->Topo = aux;
    Pilha->Tamanho++;
}

TipoItem Desempilha(TipoPilha *Pilha){
    Apontador q;
    if(Vazia(Pilha)){
        TipoItem bug;
        printf("Pilha vazia\n");
        return bug;
    }
    q = Pilha->Topo;
    Pilha->Topo = q->Prox;
    free(q);
    Pilha->Tamanho--;
    return Pilha->Topo->Item;
}

int Tamanho(TipoPilha *Pilha){
    return Pilha->Tamanho;
}

