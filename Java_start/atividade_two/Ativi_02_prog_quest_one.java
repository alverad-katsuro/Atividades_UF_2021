
import java.lang.Math;
import java.util.Scanner;

/**
 * Ativi_02_prog_quest_one
 */
public class Ativi_02_prog_quest_one {
    public static void main(String[] args) {
        /*
        list_is_even();
        double hipo;
        int menor;
        float valor;
        hipo = hypotenuse(3.0, 4.0);
        menor = smallest(5, 4, 8);
        valor = intToFloat(5);
        instructions();
        System.out.printf("A hipotenusa mede %.2f%n", hipo);
        System.out.printf("O menor resultado é %d%n", menor);
        System.out.printf("O valor do float é %.2f%n", valor);
        fahrenheit();
        celsius();
        menu_temps();
        System.out.printf("A Distancia entro os pontos mede %.2f%n", (distance(5.0, 4.0, 1.0, 1.0)));
        */
        mystery();
    }

    public static float intToFloat(float number) {
        float valor = (float) number;
        return valor;
    }
    public static void instructions() {
        System.out.println("As instruções são 'hypotenuse', 'smallest', 'intToFloat' e 'instructions'");
    }

    public static double hypotenuse(double side1, double side2) {
        double result;
        result = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return result;
    }

    public static int smallest(int x, int y, int z) {
        if (x > y){
            if (y > z){
                return z;
            } else {
                return y;
            }
        } else {
            if (x > z) {
                return z;
            } else {
                return x;
            }
        }
    }

    public static boolean isEven(int x) {
        boolean valor = false;
        if (x % 2 == 0) {
            valor = true;
        }
        return valor;
    }

    public static void list_is_even() {
        int numeros[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int entrada;
            System.out.println("Para terminar digite 0");
        while (true) {
            System.out.printf("Adicione um elemento a lista: ");
            entrada = sc.nextInt();
            numeros[cont] = entrada;
            if (entrada == 0){
                break;
            } else {
                cont++;
                if (cont > 90) {
                    System.out.printf("Adicione o proximo numero da lista, atenção você ainda tem %d%n espaços", (100 - cont));
                }
            }
        }
        sc.close();
        for (;cont >= 0; cont--) {
            String resp;
            if (isEven(numeros[cont])) {
                resp = "par";
            } else {
                resp = "impar";
            }
            System.out.printf("O número %d é %s%n", numeros[cont], resp);
        }
    }

    public static void celsius() {
        Scanner sc = new Scanner(System.in);
        Double fahreheit;
        Double celsius_temp;
        System.out.printf("Digite uma temperatura em Farenheit: ");
        fahreheit = sc.nextDouble();
        celsius_temp = 5/9 * (fahreheit - 32);
        System.out.printf("A temperatura em Celsius é: %.2f ºC %n", celsius_temp);
        sc.close();
    }

    public static void fahrenheit() {
        Scanner sc = new Scanner(System.in);
        Double celsius_temp;
        Double fahreheit;
        System.out.printf("Digite uma temperatura em Celsius: ");
        celsius_temp = sc.nextDouble();
        fahreheit = 9/5 * celsius_temp + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f ºF %n", fahreheit);
        sc.close();
    }

    public static void menu_temps() {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.printf("Digite:\n1. Celsius --> Fahrenheit\n2. Fahrenheit --> Celsius\nEscolha: ");
        escolha = sc.nextInt();
        sc.close();
        switch (escolha) {
            case 1:
                fahrenheit();
                break;
            case 2:
                celsius();
                break;
            default:
                throw new IllegalArgumentException("Nenhuma das opções selecionadas ERROR 404\nSeu computador vai pegar fogo!");
        }
    }

    public static Double distance(Double x1, Double y1, Double x2, Double y2) {
        return hypotenuse((x2 - x1), (y2 - y1));
    }

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