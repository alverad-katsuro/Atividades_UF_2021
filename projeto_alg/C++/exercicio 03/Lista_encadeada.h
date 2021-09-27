typedef int TipoChave;

typedef struct {
    TipoChave Chave;
}TipoItem;

typedef struct Celula_str *Apontador;

typedef struct Celula_str {
    TipoItem Item;
    Apontador Prox;
}Celula;

typedef struct{
    Apontador Primeiro, Ultimo;
} ListaEncadeada;

ListaEncadeada inicializa();
void FLVazia(ListaEncadeada*);
bool Vazia(ListaEncadeada*);
void Insere(TipoItem, ListaEncadeada*, Apontador);
