package classes;

public class Soma_intervalo {
    public int soma_intervalo_x_y_for(int x1, int x2) {
        int result = 0;
        for (;x1 <= (x2); x1++) {
            result += x1;
        }
        return result;
    }

    public int soma_intervalo_x_y_while(int x1, int x2){
        int result = 0;
        while (true) {
            if (x1 <= x2) {
                result += x1;
                x1++;
            } else {
                break;
            }
        }
        return result;
    }
}
