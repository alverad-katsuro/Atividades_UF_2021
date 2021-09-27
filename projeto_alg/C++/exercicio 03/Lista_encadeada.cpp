#include <iostream>
#include "Lista_encadeada.h"

using namespace std;

ListaEncadeada inicializa(){
    ListaEncadeada Lista;
    Lista.Primeiro = (Apontador) malloc(sizeof(Celula));
    Lista.Ultimo = Lista.Primeiro;
    return Lista;
}

bool Vazia(ListaEncadeada *lista){
    if (lista->Primeiro == lista->Ultimo){
        cout << "Lista Vazia" << endl;
        return true;
    }else{
        cout << "Lista com itens" << endl;
        return false;
    }
}

void FLVazia(ListaEncadeada *lista){
    lista->Primeiro = (Apontador) malloc(sizeof(Celula));
    lista->Ultimo = lista->Primeiro;
    lista->Primeiro->Prox = NULL;
}

void Insere(TipoItem item, ListaEncadeada *lista, Apontador E){
    if (!Vazia(lista)){
        Apontador novo;
        novo = (Apontador) malloc(sizeof(Celula));
        novo->Item = item;
        novo->Prox =  E->Prox;
        E->Prox = novo;
    }
    
}


