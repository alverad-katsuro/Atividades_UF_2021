typedef int Posicao;
#define InicioVetor 0
#define MaxTam 1000

typedef struct tipo_item{
    int valor;
}TipoItem;


typedef struct lista_linear{
    TipoItem item[MaxTam];
    Posicao primeiro, ultimo;
}ListaLinear;


ListaLinear inicializa();
void FLVazia(ListaLinear*);
void Insere(TipoItem, ListaLinear*);
TipoItem* Retira(ListaLinear*, Posicao);
bool Vazia(ListaLinear*);
void Imprime(ListaLinear*);
