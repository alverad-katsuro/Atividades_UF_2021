package classes;

import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade {

    public int min(Scanner sc){
        int x1, x2, x3, menor;
        System.out.printf("Digite o valor de x1: ");
        x1 = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o valor de x2: ");
        x2 = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o valor de x1: ");
        x3 = Integer.parseInt(sc.nextLine());
        menor = Math.min(x1, x2);
        menor = Math.min(x3, menor);
        System.out.println("O menor é: "+menor);
        return menor;
    }

    public int invert(Scanner sc){
        String number, reverse = "";
        int x1;
        System.out.printf("Digite o valor de x: ");
        number = sc.nextLine();
        for (int i = 0; i < number.length(); i++) {
            reverse += number.charAt(i);
        }
        x1 = Integer.parseInt(reverse);
        System.out.println("O valor invertido é: " +x1);
        return x1;
    }

    public Double distance(Scanner sc) {
        Double x1, y1, x2, y2, resp;
        System.out.printf("Digite o valor de x1: ");
        x1 = Double.parseDouble(sc.nextLine());
        System.out.printf("Digite o valor de y1: ");
        y1 = Double.parseDouble(sc.nextLine());
        System.out.printf("Digite o valor de x2: ");
        x2 = Double.parseDouble(sc.nextLine());
        System.out.printf("Digite o valor de y2: ");
        y2 = Double.parseDouble(sc.nextLine());
        resp = hypotenuse((x2 - x1), (y2 - y1));
        System.out.println("A distancia é: " +resp);
        return resp;
    }

    public static double hypotenuse(double side1, double side2) {
        double result;
        result = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        return result;
    }

    /*
    4) a

    Correto:
    int ARRAY_SIZE = 5; --> atributo final não permite mudarmos o valor da variavel
    ARRAY_SIZE = 10
    
    4)b

    Correto:
    int[] b = new int[10];
    for (int i = 0; i< b.lenght; i++){ --> i tem que ser menor que o tamanho de b pois o array começa em "0"
        b[i] = 1;
    } 

    4)c

    Correto:
    int[][] a = {{1,2}, {3,4}};
    a[1][1] = 5; --> são dois conjuntos de colchetes e não somente 1 para definir a posição
    */

    public void product(Scanner sc) {
        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            System.out.print("Digite um valor inteiro e [x] para encerrar: ");
            String s = sc.nextLine();
            if (s == "x") {
                break;
            } else if ("0123456789".contains(s)){
                lista.add(Integer.parseInt(s));
            }
        }
        int x = 1;
        for (Integer integer : lista) {
            x *= integer;
        }
        System.out.printf("O valor da multiplicação dos numeros dados é %d%n", x);
    }

    public void fibonnaci(Scanner sc) {
        int n, ultimo = 1,x1 = 0, x2 = 1;
        boolean troca = true;
        System.out.printf("Digite o valor de n: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            if (troca) {
                x1 = x1 + x2;
                troca = false;
                ultimo = x1;
            } else {
                x2 = x1 + x2;
                troca = true;
                ultimo = x2;
            }
        }
        System.out.printf("Digite de fibo n é: %d%n", ultimo);
    }

}
