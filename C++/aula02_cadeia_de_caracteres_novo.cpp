#include <iostream>
#include <string.h>

using namespace std;

int compara(char* s1, char* s2){
  int i;
  for (i=0; s1[i] != '\0' && s2[i] != '\0'; i++){
    if (s1[i] < s2[i])
      return -1;
    if (s1[i] > s2[i])
      return 1;
  }
  if (s1[i] == s2[i])
    return 0;
  else if (s2[i] != '\0')
    cout << "maior?"
    return -1;
  else 
    return 1;
}

int main() {
  char palavra1[81];
  char palavra2[81];
  cin.get(palavra1, 81);
  cin.ignore();
  cin.get(palavra2, 81);
  compara(palavra1, palavra2);
  cout << "palavra 1 " << palavra1 << " palavra 2 " << palavra2<<endl;
  cout << compara(palavra1, palavra2) << endl;
  cout << strcmp(palavra1, palavra2) << endl;
}

/*void concatena(char* dst, char* src){
  int i = 0; //indice de destino
  int j; //indice de origem
  while(dst[i] != '\0') //acha o final da cadeia de destino
    i++;
  for (j=0; src[j] != '\0'; j++){
    dst[i] = src[j];
    i++;
  }
  dst[i] = '\0';
}

int main() {
  char city[81];
  char city2[81];
  char city3[81];
  cout << "cidade: ";
  cin.get(city, 81);
  cout << "estado: ";
  cin.ignore();
  cin.get(city2, 81);
  cout << "pais: ";
  cin.ignore();
  cin.get(city3, 81);
  concatena(city, city2);
  cout << city << endl;
  strcat(city, city3);
  cout << city << endl;
}*/


/*void copia(char* dst, char* src){
  int i;
  for (i=0; i<strlen(src); i++){
    dst[i] = src[i];
  dst[i] = '\0';
}

int main() {
  char city[81];
  char city2[81];
  char city3[81];
  cin.get(city, 81);
  copia(city2, city);
  cout << "palavra 1 " << city << " palavra 2 " << city2 << endl;
  strcpy(city3, city);
  cout << "palavra 1 " << city << " palavra 2 " << city2 << " palavra 3 " << city3 << endl;
}*/

/*int comprimento (char *c){
  int n =0;
  for (int i =0; c[i]!='\0'; i++)
    n++;
  return n;
}

int main() {
  char city[81];
  cin.get(city, 81);
  cout << "palavra " << city << " contendo " << comprimento(city) << " caracteres" << endl;
  cout << "palavra " << city << " contendo " << strlen(city) << " caracteres" << endl;
}*/




/*char maiuscula (char c){
  if (c>='a' && c <= 'z')
    c = c - 'a' + 'A';
  return c;
}*/

/*int main() {
  char cidade [] = "rio"; 
  cout << "cidade " << cidade << endl;

  cout << "cidade em maiuscula: ";
  for (int i=0; i<4; i++){
    cout << maiuscula(cidade[i]);
  }
*/

/*int main() {
  char str2 [] = "ola"; 
  cout << "str2 "<< str2 << endl;

  char str3 [] = {'o', 'l', 'a', '\0'}; 
  cout << "str3 "<< str3 << endl;
  

  char str[4];
  str[0] = 'o';
  str[1] = 'l';
  str[2] = 'a';
  str[3] = '\0';
  cout << "str "<< str << endl;
}*/

/*char maiuscula (char c){
  if (c>='a' && c <= 'z')
    c = c - 'a' + 'A';
  return c;
}  for(in0;'C'i++)
    novo[i]caracterula(c[ila(c )
 out << "palavra " << c << endl;
 maiuscula(c[i]);
  cout << "maiuscula " << n << endl;
}*/


/*int digito (char c){
  if ((c>='0') && (c<='9'))
    return 1;
  else
    return 0;
}

int main() {
  char c = '0';
  cout << "digito " << digito(c) << endl;
  cout << " caracter " << c << ", em decimal " << (int) c;
}*/