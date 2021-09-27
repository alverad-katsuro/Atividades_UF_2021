typedef int TipoChave;

typedef struct {
    TipoChave Chave;
}TipoItem;

typedef struct Celula_str *Apontador;

typedef struct Celula_str{
    TipoItem Item;
    Apontador Prox;
} Celula;

typedef struct{
    Apontador Fundo, Topo;
    int Tamanho;
} TipoPilha;

TipoPilha inicializa();
void FPVazia(TipoPilha*);
int Vazia(TipoPilha*);
void Insere(TipoItem, TipoPilha*, Apontador);
void Empilha(TipoItem, TipoPilha*);
TipoItem Desempilha(TipoItem*);
int Tamanho(TipoPilha*);
