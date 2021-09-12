#include <iostream>
#include "Arvore.cpp"


using namespace std;


int main(int argc, char const *argv[]){
    Arvore *ar = inicializa(5);
    addElement(2, ar);
    addElement(7, ar);
    addElement(6, ar);
    addElement(9, ar);
    addElement(8, ar);
    addElement(15, ar);
    cout<< ar->direita->dado << endl;
    removeElement(7, ar);
    cout<< ar->direita->dado << endl;
    return 0;
}
