package classes;
import java.lang.Math;

public class Media_desvio {
    public double media(double[] array){
        double media = 0;
        for (double i : array) {
            media += i;
        }
        media /= array.length;
        return media;
    }

    public double desvio(double[] array) {
        double media = media(array);
        double desvio = 0;
        for (double i : array) {
            desvio += Math.pow((i - media), 2.0);
        }
        desvio = Math.sqrt(desvio/array.length);
        return desvio;
        
    }
}
