package atividades_java;

public class Contato {
    private String nome;
    private String email;
    
    public Contato(String nome, String email) {
        setName(nome);
        setEmail(email);
    }

    public Contato() {
        this.nome = "falta definir";
        this.email = "falta definir";
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

}
