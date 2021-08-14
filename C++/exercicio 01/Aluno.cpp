#include <iostream>
#include <string>
#include <stdio.h>
#include "Aluno.h"

using namespace std;

Aluno inicializa(int cpf, int matricula){
    Aluno aluno;
    aluno.cpf = cpf;
    aluno.matricula = matricula;
    return aluno;
}

void setNotas(Aluno *aluno){
    comeco:
    int avaliacao;
    double nota;
    string cont;
    printf("Digite a avaliação que você quer inserir a nota: ");
    cin >> avaliacao;
    printf("Digite a nota da %d avaliação: ", avaliacao);
    cin >> nota;
    aluno->notas[(avaliacao - 1)] = nota;
    cout << "Nota adicionada com sucesso \n";
    printf("Você deseja adicionar outra nota? [S/N]: ");
    cin >> cont;
    if (cont == "S" || cont == "s"){
        goto comeco;
    } else{
        cout << "Até mais!\n";
    }
}

int getNota(Aluno *aluno, int avalaicao){
    return aluno->notas[avalaicao-1];
}

void getConceito(Aluno *aluno){
    int result = 0;
    for (int i = 0; i < 4; i++){
        result += aluno->notas[i];
    }
    if (result/4 < 5){
        cout << "Conceito: Insuficiente\n";
    } else if (result / 4 >= 5 && result / 4 < 7){
        cout << "Conceito: Regular\n";
    } else if (result / 4 >=7 || result / 4 < 9){
        cout << "Conceito: Bom\n";
    } else if (result / 4 > 9){
        cout << "Conceito: Excelente\n";
    }
    
}

void zeraNota(Aluno *aluno){
    for (int i = 0; i < 4; i++){
        aluno->notas[i] = 0.0;
    }
}
