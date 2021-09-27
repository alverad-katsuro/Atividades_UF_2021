#define MAXTAM 1000
typedef int TipoApontador;
/*
typedef int TipoChave;
typedef struct {
    TipoChave Chave;
}TipoItem;
*/
typedef struct {
    int Item[MAXTAM];
    TipoApontador Topo;
}Pilha_int;

Pilha_int inicializa_int();
void FPVazia(Pilha_int*);
int Vazia(Pilha_int*);
void Empilha(char, Pilha_int*);
char Desempilha(Pilha_int*);
int Tamanho(Pilha_int*);

