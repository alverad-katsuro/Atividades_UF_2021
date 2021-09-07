import conta.*;


public class Main_conta {
    public static void main(String[] args) {
        Cliente alfredo = new Cliente("Alfredo Gabriel", 1000, 100);
        Cliente reginaldo = new Cliente("Reginaldo");
        System.out.println(alfredo.toString());
        System.out.println(reginaldo.toString());
        alfredo.deposito(500);
        alfredo.tranferir(reginaldo, 50.0f);
        System.out.println(alfredo.toString());
        System.out.println(reginaldo.toString());
        reginaldo.sacar(50);
        System.out.println(reginaldo.toString());
    }
}
