#include "Arvore.h"
#include <iostream>


using namespace std;

Arvore * inicializa(int x){
    Arvore *arvore;
    arvore = (Arvore*)malloc(sizeof(Arvore));
    arvore->esquerda = NULL;
    arvore->direita = NULL;
    arvore->dado = x;
    return arvore;
}

Arvore * inicializa(){
    Arvore *arvore;
    arvore = (Arvore*)malloc(sizeof(Arvore));
    arvore->esquerda = NULL;
    arvore->direita = NULL;
    return arvore;
}


void addElement(int elemento, Arvore *arvore){
    if (arvore->dado > elemento){
        if (arvore->esquerda == NULL){
            arvore->esquerda = inicializa(elemento);
        } else {
            addElement(elemento, arvore->esquerda);
        }
    } else if(arvore->dado < elemento) {
        if (arvore->direita == NULL){
            arvore->direita = inicializa(elemento);
        } else {
            addElement(elemento, arvore->direita);
        }
    } else{
        cout<< "Dado já existente" << endl;
    }
}

int searchElement(int elemento, Arvore* arvore){
    if (elemento == arvore->dado){
        return arvore->dado;
    } else if(elemento > arvore->dado && arvore->direita != NULL){
        return searchElement(elemento, arvore->direita);
    } else if(elemento < arvore->dado && arvore->esquerda != NULL){
        return searchElement(elemento, arvore->esquerda);
    } else {
        return -1;
    }
}

void modulo_remove(int elemento, Arvore* arvore){
    if (arvore->direita == NULL && arvore->esquerda == NULL){
        *arvore = *inicializa();
        cout<< "entro" <<endl;
    } else if (arvore->direita != NULL && arvore->esquerda != NULL) {
        Arvore* temp = (Arvore*)malloc(sizeof(Arvore)); 
        temp = arvore->direita;
        while (true){
            if (temp->esquerda == NULL){
                arvore->dado = temp->dado;
                if (temp->direita != NULL){
                    *temp = *temp->direita;
                }
                break;
            } else {
                *temp = *temp->esquerda; 
            }
        } 
    } else {
        if (arvore->direita != NULL){
            *arvore = *arvore->direita;
        } else {
            *arvore = *arvore->esquerda;
        }
    }
}

bool removeElement(int elemento, Arvore* arvore){
    if (elemento == arvore->dado){
        cout<< "entro =" <<endl;
        modulo_remove(elemento, arvore);
        return true;
    } else if (elemento > arvore->dado && arvore->direita != NULL){
        cout<< "entro >" <<endl;
        return removeElement(elemento, arvore->direita);
    } else if (elemento < arvore->dado && arvore->esquerda != NULL){
        cout<< "entro <" <<endl;
        return removeElement(elemento, arvore->esquerda);
    } else if (arvore->esquerda != NULL && arvore->direita != NULL){
        return false;
    }
    return false;
}

