#include "Data.cpp"

typedef struct {
    int matricula;
    int cpf;
    double notas[4];
    char conceito;
    Data nascimento;
} Aluno;

Aluno inicializa(int, int);
void setNotas(Aluno *);
void getConceito(Aluno *);
void zeraNota(Aluno *);
int getNota(Aluno, int);
