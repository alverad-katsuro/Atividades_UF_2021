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
    arvore->dado;
    return arvore;
}


void addElement(int elemento, Arvore *arvore){   
    if (arvore->dado == '\0'){
        arvore->dado = elemento;
    } else if (arvore->dado > elemento){
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
    } else {
        cout<< "Dado já existente" << endl;
    }
}

void addElement(int array[], int size, Arvore *arvore){
    for (int i = 0; i < size; i++){
        addElement(array[i], arvore);
    }    
}

bool searchElement(int elemento, Arvore* arvore){
    if (elemento == arvore->dado){
        return 1;
    } else if(elemento > arvore->dado && arvore->direita != NULL){
        return searchElement(elemento, arvore->direita);
    } else if(elemento < arvore->dado && arvore->esquerda != NULL){
        return searchElement(elemento, arvore->esquerda);
    } else {
        return 0;
    }
}

void modulo_remove(int elemento, Arvore* arvore){
    if (arvore->direita != NULL && arvore->esquerda != NULL) {
        Arvore* temp = (Arvore*)malloc(sizeof(Arvore)); 
        Arvore* anterior_temp;
        temp = arvore->direita;
        anterior_temp = NULL;
        while (true){
            if (temp->esquerda == NULL){
                arvore->dado = temp->dado;
                if (temp->direita != NULL){
                    *temp = *temp->direita;
                } else {
                    if (anterior_temp != NULL && anterior_temp != arvore){
                        anterior_temp->esquerda = NULL;
                    } else {
                        arvore->direita = NULL;
                    }
                }
                break;
            } else {
                anterior_temp = temp;
                temp = temp->esquerda;
            }
        } 
    } else if (arvore->direita != NULL || arvore->esquerda != NULL) {
        if (arvore->direita != NULL){
            *arvore = *arvore->direita;
        } else {
            *arvore = *arvore->esquerda;
        }
    }
}

bool removeElement(int elemento, Arvore* arvore){
    if (elemento == arvore->dado){
        modulo_remove(elemento, arvore);
        return true;
    } else if (elemento > arvore->dado && arvore->direita != NULL){
        if (arvore->direita->direita == NULL && arvore->direita->esquerda == NULL && arvore->direita->dado == elemento){
            arvore->direita = NULL;
            return true;
        } else {
            return removeElement(elemento, arvore->direita);
        }
    } else if (elemento < arvore->dado && arvore->esquerda != NULL){
        if (arvore->esquerda->direita == NULL && arvore->esquerda->esquerda == NULL && arvore->esquerda->dado == elemento){
            arvore->esquerda = NULL;
            return true;
        } else {
            return removeElement(elemento, arvore->esquerda);
        }
    } else if (arvore->esquerda == NULL && arvore->direita == NULL){
        return false;
    }
    return false;
}

void em_ordem(Arvore* arvore){
    if (arvore->dado != '\0' && arvore != NULL){
        if (arvore->esquerda != NULL){em_ordem(arvore->esquerda);}
        cout << arvore->dado << " ";
        if (arvore->direita != NULL){em_ordem(arvore->direita);}
    } else {
        return;
    }
}

