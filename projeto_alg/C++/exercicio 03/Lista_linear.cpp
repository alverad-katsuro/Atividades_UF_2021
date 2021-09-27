#include <iostream>
#include "Lista_linear.h"

using namespace std;

ListaLinear inicializa(){
    ListaLinear lista;
    lista.item;
    lista.primeiro = 0;
    lista.ultimo = 0;
    return lista;
}

void FLVazia(ListaLinear* lista){
    lista->primeiro = InicioVetor;
    lista->ultimo = lista->primeiro;
}

void Insere(TipoItem *x, ListaLinear* lista){
    if (lista->ultimo >= MaxTam){
        cout << "Lista cheia\n";
    } else {
        lista->item[lista->ultimo] = *x;
        lista->ultimo++;
    }
}

TipoItem* Retira(ListaLinear* lista, Posicao index){
    if (Vazia(lista) || index > lista->ultimo){
        cout << "Posição inexistente\n";
        return NULL;
    }
    TipoItem* item;
    item = (TipoItem*) malloc(sizeof(TipoItem));
    *item = lista->item[index];
    for (int i = 0; i < lista->ultimo; i++)
    {
        if (i >= index && i < lista->ultimo)
        {
            lista->item[i] = lista->item[i+1];
        }
    } 
    return item;
}

bool Vazia(ListaLinear* lista){
    if (lista->primeiro == lista->ultimo){
        return 1;
    } else {
        return 0;
    }
}

void Imprime(ListaLinear* lista){
    for (int i = 0; i < lista->ultimo; i++)
    {
        cout<< "O index " << i << " tem valor: " << lista->item[i].valor << endl;
    } 
}