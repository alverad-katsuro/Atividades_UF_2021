package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    ArrayList<Banheiro> banheiros = new ArrayList<>();
    ArrayList<Cozinha> cozinha = new ArrayList<>();
    Endereco endereco;
    ArrayList<Garagem> garagem = new ArrayList<>();
    ArrayList<Quarto> quarto = new ArrayList<>();
    ArrayList<Sala> sala = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addBanheiro(){
        this.banheiros.add(new Banheiro());
    }
    public void addCozinha(){
        this.cozinha.add(new Cozinha());
    }
    public void addGaragem(){
        this.garagem.add(new Garagem());
    }
    public void addQuarto(){
        this.quarto.add(new Quarto());
    }
    public void addSala(){
        this.sala.add(new Sala());
    }

    public Scanner getSc() {
        return sc;
    }

    public void setEndereco() {
        Endereco endereco = new Endereco();
        endereco.defineEndereco(getSc());
        this.endereco = endereco;
    }

    public void descricaoCasa(){
        System.out.println("Descrição da Casa");
        System.out.printf("Quartos: %d%n", quarto.size());
        System.out.printf("Sala: %d%n", sala.size());
        System.out.printf("Garagem: %d%n", garagem.size());
        System.out.printf("Banheiro: %d%n", banheiros.size());
        System.out.printf("Cozinha: %d%n", cozinha.size());
        System.out.printf("Endereço: %s, %s, %s%n", endereco.getEndereco()[0], endereco.getEndereco()[1], endereco.getEndereco()[2]);
    }
}
