#include <iostream>
#include <string>
#include "contaBancaria.cpp"

using namespace std;

int main(){
    string palavra = "Oie";
    int a[4];
    a[0] = 5;
    cout << "a[0] = " << a[1] << "\n";
    return 0;
};

/*
int main() {
    contaBancaria conta;
    conta = inicializa(11, 100);
    cout << "antes da movimentação \n";
    imprime(conta);

    deposito(&conta, 50);

    imprime(conta);

    saque(&conta, 100);

    cout << "depois da movimentação \n";
    imprime(conta);
}
*/