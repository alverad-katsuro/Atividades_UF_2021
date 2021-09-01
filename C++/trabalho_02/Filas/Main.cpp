#include <iostream>
#include "Fila.cpp"

int main(int argc, char const *argv[]){
    Fila fila = inicializa();
    Enqueue(1, &fila);
    Enqueue(2, &fila);
    Enqueue(3, &fila);
    Enqueue(4, &fila);
    Enqueue(5, &fila);
    Enqueue(6, &fila);
    Enqueue(7, &fila);
    furarFila(100, &fila);
    showQueue(&fila);
    return 0;
}
