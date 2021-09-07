package classes;

import java.util.Scanner;

public class Menu_ingresso {

    public static void chama_menu(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite\n1. Ingreso Normal\n2. Ingresso Vip\nResposta: %n");
        int esco_ingre = sc.nextInt();
        switch (esco_ingre) {
            case 1:
                Normal normal = new Normal();
                System.out.printf("Ingresso %s%n", normal);
                System.out.printf("Valor %.2f%n", normal.getValor());
                break;
            case 2:
                System.out.printf("Digite\n1. Camarote Superior\n2. Camarote Inferior\nResposta: %n");
                int esco_camarote = sc.nextInt();
                switch (esco_camarote) {
                    case 1:
                        Camarote_superior cams = new Camarote_superior();
                        System.out.printf("Ingresso Vip%n");
                        System.out.printf("Valor %.2f%n", cams.getValor());
                        break;
                    case 2:
                        Camarote_inferior cami = new Camarote_inferior();
                        System.out.printf("Ingresso Vip%n");
                        System.out.printf("Valor %.2f%n", cami.getValor());
                        break;
                }
                break;
        }
        sc.close();
    }
}
