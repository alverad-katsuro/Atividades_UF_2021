package classes;

public class Calcula_pi {
    public static void calcula_pi(int qt_termos) {
        if (qt_termos > 0) {
            String pi_esperado = "3.14159";
            int posicao = -1;
            double pi = 4;
            for (int i = 1; i <= qt_termos; i++) {
                if (i % 2 == 1) {
                    pi += Calcula_pi.termos_negativos(i);
                    //System.out.println(Calcula_pi.termos_negativos(i));
                } else {
                    pi += Calcula_pi.termos_positivos(i);
                    //System.out.println(Calcula_pi.termos_negativos(i));
                }
                System.out.printf("O valor de pi para %d termos é %2f%n", i, pi);
                if (posicao == -1){
                    if (pi_esperado == String.format("%.6f", pi).substring(0, 7)) {
                        posicao = i;
                    }
                }
            }
            if (posicao != -1){
                System.out.printf("O valor de termos para %s é %d%n", pi_esperado, posicao);
            }

        } else {
            
        }
    }

    private static double termos_negativos(int k) {
        return (-4.0 / (2 * k + 1));
    }

    private static double termos_positivos(int k) {
        return (4.0 / (2 * k + 1));
    }
}
