struct Arvore {
    Arvore *esquerda;
    Arvore *direita;
    int dado;
};

Arvore* inicializa(int);

void addElement(int, Arvore*);
int searchElement(int, Arvore* );
void em_ordem(Arvore*);