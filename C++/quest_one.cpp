#include <iostream>
#include <string>

using namespace std;


/*
Alfredo Gabriel de Sousa Oliveira
Marcus Marciel Oliveira
*/

string inverte_string(string palavra) {
    int i = palavra.length();
    string palavra_temp;
    for (i >= 0 ; i--;){
        palavra_temp += palavra[i];
    }
    return palavra_temp;
};

void compara(string palavra, string palavra_invertida){
    int len = palavra.size();
    bool palindromo = true;
    for (len >= 0; len--;){
        /*
        cout << "palavra: " << palavra[len] << " invrt: " << palavra_invertida[len] << "\n";
        cout << (palavra[len] != palavra_invertida[len]) << "\n";
        */
        if (palavra[len] != palavra_invertida[len]){
            cout << palavra << " não é um Palíndromo\n";
            palindromo = false;
            break;
        }
    }
    if (palindromo){
    cout << palavra << " é um Palíndromo\n";
    }
};

int main() {
    string palavra;
    string palavra_invertida;
    cout << "Digite uma palavra: ";
    getline(cin, palavra);
    palavra_invertida = inverte_string(palavra);
    compara(palavra, palavra_invertida);
};