#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <iostream>
using namespace std;

int main() {
    /*setlocale(LC_ALL, "Portuguese");
    unsigned char texto;
    texto = 138;
    printf("Digite uma letra: ");
    cout << "A letra é no cout " << texto << "\n";
    printf("A letra é %c\n", char.size);
    */
    int i;
    for(i=32;i<255;i++){
        if(i%10==0)
            printf("\n");
            printf("%d = %c\t", i, i);
    }
    printf("\n");
}