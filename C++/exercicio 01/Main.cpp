#include <iostream>
#include <string>
#include "Aluno.cpp"

int main(int argc, char const *argv[]){
    Aluno aluno;
    aluno = inicializa(2797387228, 2200452348);
    zeraNota(&aluno);
    setNotas(&aluno);
    getConceito(&aluno);
    return 0;
}
