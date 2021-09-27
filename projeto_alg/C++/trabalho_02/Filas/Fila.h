#define MAXTAM 1000
typedef int TipoApontador;

typedef struct {
    int Item[MAXTAM];
    TipoApontador Frente, Tras;
}Fila;

Fila inicializa();
void EmptyNow(Fila *);
bool isEmpty(Fila *);
bool isFull(Fila *);
bool Enqueue(int , Fila *);
int Dequeue(Fila *);
bool showQueue(Fila *);
bool furarFila(Fila *, int);
