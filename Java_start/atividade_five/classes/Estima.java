package classes;

public class Estima {
    public static double estima(int number_terms) {
        if (number_terms > 0) {
            double e = 1;
            for (int i = 1; i <= number_terms; i++) {
                e += (1.0/(Fatorial.fatorial(i)));
            }
            return e;    
        } else {
            return 0.0;
        }
    }
    
}
