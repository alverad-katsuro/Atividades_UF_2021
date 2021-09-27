struct Arvore {
    Arvore *esquerda;
    Arvore *direita;
    int dado;
};

Arvore* inicializa(int);
Arvore* inicializa();
void addElement(int, Arvore*);
bool searchElement(int, Arvore* );
void em_ordem(Arvore*);