#define MAXTAM 1000
typedef int TipoApontador;


/*
typedef int TipoChave;
typedef struct {
    TipoChave Chave;
}TipoItem;
*/
typedef struct {
    char Item[MAXTAM];
    TipoApontador Topo;
}Pilha_char;

Pilha_char inicializa();
void FPVazia(Pilha_char*);
int Vazia(Pilha_char*);
void Empilha(char, Pilha_char*);
char Desempilha(Pilha_char*);
int Tamanho(Pilha_char*);

