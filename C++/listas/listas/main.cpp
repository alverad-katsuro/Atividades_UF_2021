#include <iostream>
#include "lista.h"

using namespace std;

int main(void){
  TipoLista* list;
  list = InicializaLista();
  cout << "lista vazia?: " << Vazia(list) << endl;
  TipoItem* item; 
  item->valor = 10;
  cout << "valor a ser inserido: " << item->valor  << endl;
  Insere(item, list);
  item->valor = 20;
  cout << "valor a ser inserido: " << item->valor  << endl;
  Insere(item, list);
  cout << "lista vazia?: " <<  Vazia(list) << endl;
  cout << "Tamanho da lista: " << Tamanho_lista(list)  << endl;

  cout << "consulta pelo valor: 10"  << endl;
  Busca(10, list);
  cout << "Imprimir a Lista" << endl;
  Imprime(list);
  cout << "Remover na posicao: 0" << endl;
  Retira(0, list);
  cout << "tamanho da lista: " << Tamanho_lista(list) << endl;
  cout << "Faz a lista ficar vazia" << endl;
  FLVazia(list);
  cout << "tamanho da lista: " << Tamanho_lista(list) << endl;
  cout << "lista vazia?: " <<  Vazia(list) << endl;
}

