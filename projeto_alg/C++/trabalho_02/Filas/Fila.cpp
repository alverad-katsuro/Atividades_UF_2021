#include "Fila.h"
#include <iostream>

using namespace std;

Fila inicializa(){
    Fila fila;
    EmptyNow(&fila);
    return fila;
}

void EmptyNow(Fila *Fila){
    Fila->Frente = 0;
    Fila->Tras = 0;
}

bool isEmpty(Fila *Fila){
    return (Fila->Frente == Fila->Tras);
}

bool isFull(Fila *Fila){
    if ((Fila->Tras + 1) % MAXTAM == Fila->Frente){
        cout << "Fila Cheia" <<endl;
        return 1;
    } else {
        return 0;
    }
}

bool Enqueue(int x, Fila *Fila){
    if (isFull(Fila)){
        return 0;
    } else {
        Fila->Item[Fila->Tras] = x;
        Fila->Tras = (Fila->Tras + 1) % MAXTAM;
    }
    return 1;
}

int Dequeue(Fila *Fila){
    if(isEmpty(Fila)){
        cout << "Fila está vazia" << endl;
        return -1;
    } else {
        int idx = Fila->Frente;
        Fila->Frente = (Fila->Frente + 1) % MAXTAM;
        return Fila->Item[idx];
    }
}
int lenght(Fila *Fila){
    if (isEmpty(Fila)){
        return 0;
    }
    else{
        return Fila->Tras;
    }
}

bool furarFila(int x, Fila *Fila){
    if (isEmpty(Fila) || isFull(Fila)){
        return 0;
    } else {
        for (int i = Fila->Tras; i >= Fila->Frente; i--){
            Fila->Item[i + 1] = Fila->Item[i];
        }
        Fila->Item[Fila->Frente] = x;
    }
    return 1;

}

bool showQueue(Fila *Fila){
    if (isEmpty(Fila)){
        return 0;
    }
    TipoApontador index = Fila->Frente;
    while (true){
        cout << "Posição: " << index << " valor: " << Fila->Item[index] << endl; 
        index += 1;
        if (index == Fila->Tras){
            break;
        }
    }
    return 1;
}