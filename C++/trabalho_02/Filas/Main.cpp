#include <iostream>
#include "Fila.cpp"

int main(int argc, char const *argv[]){
    Fila fila = inicializa();
    Enqueue(5, &fila);
    Enqueue(5, &fila);
    Enqueue(5, &fila);
    Enqueue(56, &fila);
    Enqueue(5, &fila);
    Enqueue(5, &fila);
    Enqueue(5, &fila);
    furarFila(100, &fila);
    showQueue(&fila);
    return 0;
}
