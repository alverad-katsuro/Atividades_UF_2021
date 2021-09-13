#include <iostream>
#include "Arvore.cpp"


using namespace std;


int main(int argc, char const *argv[]){
    Arvore *ar = inicializa(3);
    addElement(2, ar);
    addElement(7, ar);
    addElement(6, ar);
    addElement(9, ar);
    addElement(8, ar);
    addElement(15, ar);
    addElement(5, ar);
    addElement(4, ar);
    em_ordem(ar);
    cout << endl;
    removeElement(3, ar);
    em_ordem(ar);
    cout << endl;
    removeElement(5, ar);
    em_ordem(ar);
    cout << endl;
    return 0;
}
