#include <iostream>
#include "Pilha_char.cpp"
#include "Pilha_int.cpp"
#include <string>

using namespace std;

string low_str(string palavra){
    string palavra_re = "";
    for (int i = 0; i <= palavra.length(); i++){
        if (palavra[i] >= 65 && palavra[i] <= 90){
            palavra_re += (palavra[i] + 32);
        } else {
            palavra_re += palavra[i];
        }
    };
    return palavra_re;
}

string reverse_witch_pill(string palavra){
    Pilha_char pilha_palava = inicializa();
    Pilha_int pilha_onde_tem_espaco = inicializa_int();
    string palavra_fim = "";
    Empilha(0, &pilha_onde_tem_espaco);
    for (int i = 0; i < palavra.length(); i++){
        if (palavra[i] == ' '){
            Empilha(i, &pilha_onde_tem_espaco);
        }
    };
    int fim = (palavra.length() - 2);
    int start = Desempilha(&pilha_onde_tem_espaco);
    int i = start;
    while (true)
    {        
        if (i == fim + 1 && !Vazia(&pilha_onde_tem_espaco))
        {
            Empilha(' ', &pilha_palava);
            fim = start - 1; 
            i = Desempilha(&pilha_onde_tem_espaco);
            start = i;
        } else if (i == fim + 1 && Vazia(&pilha_onde_tem_espaco))
        {
            break;
        }
        if (palavra[i] != ' ')
        {
        printf("Inicio %d Fim %d\n", i, fim);
        printf("'%c' espaco? %d\n", palavra[i], palavra[i] == '+');
        Empilha(palavra[i], &pilha_palava);    
        }
        
        i++;
    }        
    for (int i = 0; i < palavra.length() - 1; i++)
    {
        palavra_fim += Desempilha(&pilha_palava);
    };
    return palavra_fim;
}


int main(int argc, char const *argv[]){
    string palavra;
    cout << "Digite uma palavra: ";
    getline(cin, palavra);
    cout << reverse_witch_pill(low_str(palavra)) << endl;
    return 0;
}

