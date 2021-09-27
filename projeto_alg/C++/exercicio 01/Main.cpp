#include <iostream>
#include <string>
#include "Aluno.cpp"

int main(int argc, char const *argv[]){
    /*
    */
    Aluno aluno;
    aluno = inicializa(2797387228, 2200452348);
    zeraNota(&aluno);
    setNotas(&aluno);
    getConceito(&aluno);
    setMes(&aluno.nascimento, 12);
    setAno(&aluno.nascimento, 15);
    setDia(&aluno.nascimento, 15);
    return 0;
}
