#include <iostream>
#include "Arvore.cpp"


using namespace std;


int main(int argc, char const *argv[]){
    Arvore *ar;
    ar = inicializa();
    int a[23] = {86, 11, 7, 35, 170, 2, 120, 21, 88, 152, 31, 12, 181, 28, 134, 70, 1, 85, 25, 77, 10, 128, 198};
    addElement(a, 23, ar);
    em_ordem(ar);
    cout << "\n" << endl;
    /*
    // Aqui, para facilitar sua vida coloquei os valores/saida de acordo com a arvore da 'pagina 12' & 'aula04_2_arvore.pdf'
    //cout << ar->dado <<endl;
    addElement(7, ar);
    //cout << ar->dado <<endl;
    addElement(13, ar);
    // Direita da raiz
    //cout << ar->direita->dado <<endl;
    addElement(20, ar);
    // Direita do 13
    //cout << ar->direita->direita->dado <<endl;
    addElement(4, ar);
    // Esquerda da raiz
    //cout << ar->esquerda->dado <<endl;
    addElement(1, ar);
    // Esquerda do 4
    //cout << ar->esquerda->esquerda->dado <<endl;
    addElement(18, ar);
    // Esquerda do 20
    //cout << ar->direita->direita->esquerda->dado <<endl;
    addElement(5, ar);
    // Direita do 4
    //cout << ar->esquerda->direita->dado <<endl;
    addElement(11, ar);
    // Esquerda do 13
    //cout << ar->direita->esquerda->dado <<endl;
    cout << "\nEm Ordem: ";
    em_ordem(ar);
    cout << endl;
    removeElement(7, ar);
    cout << "Removendo 7 -> 11 assume: ";
    em_ordem(ar);
    removeElement(7, ar);
    cout << "\nTentando remover o 7 novamente: ";
    em_ordem(ar);
    removeElement(11, ar);
    cout << "\nRemovendo 11 -> 13 assume: ";
    em_ordem(ar);
    removeElement(4, ar);
    cout << "\nRemovendo 4 -> 5 assume: ";
    em_ordem(ar);
    removeElement(1, ar);
    cout << "\nRemovendo 1 -> 1 some: ";
    em_ordem(ar);
    removeElement(5, ar);
    cout << "\nRemovendo 5 -> 13 assume: ";
    em_ordem(ar);
    cout << endl;
    cout << "\nTeste da busca 1->true/0->false\n" << endl;
    cout << "Buscando pelo valor 13: " << searchElement(13, ar) << endl;
    cout << "Buscando pelo valor 5: " << searchElement(5, ar) << endl;
    */
    return 0;
}
