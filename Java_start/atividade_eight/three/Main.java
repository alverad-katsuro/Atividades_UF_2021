package three;

import three.classes.*;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("gato");
        Gato gato2 = new Gato("gatooooo");
        Cachorro cachorro = new Cachorro("cachorro");
        Boi boi = new Boi("boi1");
        Boi boi2 = new Boi("boi2");
        Boi boi3 = new Boi("boi3");
        Animal animal[] = {gato, gato2, cachorro, boi, boi2, boi3};
        Zoo zoo = new Zoo();
        for (Animal animall : zoo.filtraEspecie(animal, "Boi")) {
            System.out.println(animall.getNomeAnimal());
        }        
        for (Resultado resultado : zoo.contabilizaEspecies(animal)) {
            System.out.println(resultado.getNomeEspecie() + " " + resultado.getQuantidade());
        }
        for (String nome : zoo.classificaEspecie(animal)) {
            System.out.println(nome);
        }
        /*
        */
    }
}
