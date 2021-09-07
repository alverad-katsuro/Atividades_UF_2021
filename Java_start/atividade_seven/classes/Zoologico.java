package classes;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Mamifero> mamiferos_list = new ArrayList<>();
    private ArrayList<Peixe> peixe_list = new ArrayList<>();

    public ArrayList<Mamifero> getMamiferos_list() {
        return this.mamiferos_list;
    }
    public ArrayList<Peixe> getPeixe_list() {
        return this.peixe_list;
    }
    public void addAnimal(Mamifero mamifero){
        getMamiferos_list().add(mamifero);
    }

    public void addAnimal(Peixe peixe){
        getPeixe_list().add(peixe);
    }

    public void exibeTudo(){
        for (Mamifero mamifero : getMamiferos_list()) {
            mamifero.descricao();
        }
        for (Peixe peixe : getPeixe_list()) {
            peixe.descricao();
        }
    }
}
