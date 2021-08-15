package classes;

public class Codigo_correto {
    public void letra_a(int age) {
        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65");
        } else{
            System.out.println("Age in less than 65");
        }
    }
    
    public void letra_b() {
        int total = 0;
        int x = 1;
        while (x <= 10) {
            total += x;
            ++x;
        }
        System.out.println(total);
    }

    public void letra_c() {
        int total = 0;
        int x = 0;
        while (x <= 100) {
            total += x;
            ++x;
        }
        System.out.println(total);
    }

    public void letra_d() {
        int y = 0;
        while (y > 0) {
            System.out.println(y);
            ++y;
            /*
            if (y == 10){
                break;
            }
            */
        }
        // Obs: o codigo está correto, porem nunca termina pois é um loop infinito.
        // É possivel adotar a solução acima para terminar o loop.
    }
    
}
