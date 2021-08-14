package classes;

public class Fatorial {
    public static int fatorial(int x1) {
        int result = 1;
        for (int i = 1; i <= x1; i++) {
            result *= i;
        }
        return result;
    }
}
