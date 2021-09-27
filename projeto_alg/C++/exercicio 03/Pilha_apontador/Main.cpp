#include <iostream>
#include "Pilha.cpp"
using namespace std;

int main(int argc, char const *argv[]){
    TipoPilha pilha = inicializa();
    TipoPilha pilha2 = inicializa();
    TipoItem item, item2;
    item.Chave = 7;
    item2.Chave = 17;
    Empilha(item, &pilha);
    Empilha(item2, &pilha);
    Desempilha(&pilha2);
    cout << "Stack 1 " << Desempilha(&pilha) << endl;
    return 0;
}
