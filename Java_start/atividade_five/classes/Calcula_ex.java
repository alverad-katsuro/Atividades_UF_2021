package classes;

import java.lang.Math;
public class Calcula_ex {
    public static void calcula_ex(int number_terms) {
        if (number_terms > 0) {
            for (double x = 1; x <= 10; x++) {
                double e = 1;
                for (int i = 1; i <= number_terms; i++) {
                    e += (Math.pow(x, i) / Fatorial.fatorial(i));
                }
                e = Math.pow(e, 1.0/x);
                System.out.printf("O valor de 'e' para quando 'x' é %.0f, é %2f%n", x, e);
                if (number_terms > 13) {
                    System.out.println("Note que a partir de 14 termos para x > 5 o computador perde a precisão");
                }
            }
        } else {
            System.out.println("O valor para 0 termos é 0");;
        }
    }
}
