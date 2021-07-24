package atividades_java;
public class Mult_soma_zero_at_trinta {
    
    public static void main(String[] args) {
        int soma = 0;
        double mult = 1;
        for (int i = 1; i <= 29; i += 2) {
            soma += i;
        }
        for(int k = 2; k <= 30; k += 2) {
            mult *= k;
        }
        System.out.printf("A soma é: "+ soma + " a multiplicação é: " + mult + "\n");
    }

}
