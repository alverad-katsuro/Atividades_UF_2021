package atividades_java;

public class Teste {
    public static void mystery() {
        int x = 1;   
        int total = 0;
        while (x <= 10){
            int y = x * x;
            System.out.println(y);
            total += y;
            ++x;
        }   
        System.out.printf("Total is %d%n", total);
    }
}
