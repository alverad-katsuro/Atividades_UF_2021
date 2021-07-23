package Java_start.atividades_java;
public class Maior_valor {
    
    public static void main(String[] args) {
        System.out.println("Foi importada a classe Maior_valor");
        maior_de_dois(5, 8);
    }

    public static int maior_de_dois(int a, int b) {
        if (a > b) {
            System.out.println(a);
            return a;
        } else {
            System.out.println(b);
            return b;
        }
    }
}
