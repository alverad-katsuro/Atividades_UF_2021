public class Teste {
    public static void main(String[] args) {
        final int num = 6;
        for (int i = 0; i < num; i++) 
            System.out.println(X(i));
        
    }

    public static int X(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) 
            result *= i;
        return result;
    }
}
