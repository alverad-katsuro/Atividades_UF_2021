#include <iostream>
#include <string>
#include <stdio.h>
#include "Data.h"

using namespace std;

int validDia(int dia){
    if (dia > 0 && dia < 32){
        return 1;
    } else {
        return 0;
    }
}

int validMes(int mes){
    if (mes > 0 && mes < 13){
        return 1;
    } else {
        return 0;
    }
}
int validAno(int ano){
    if (ano < 2022){
        return 1;
    } else {
        return 0;
    }
}

void setDia(Data * data, int dia){
    if (validDia(dia)){
        data->dia = dia;
    } else{
        cout << "Valor Invalido\n";
    }
}

void setMes(Data * data, int mes){
    if (validMes(mes)){
        data->mes = mes;
    } else{
        cout << "Valor Invalido\n";
    }
}

void setAno(Data * data, int ano){
    if (validAno(ano)){
        data->ano = ano;
    } else{
        cout << "Valor Invalido\n";
    }
}