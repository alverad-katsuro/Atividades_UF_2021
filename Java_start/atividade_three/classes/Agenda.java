package atividade_three.classes;


public class Agenda {
    private Pessoas[] agenda = new Pessoas[10];
    private int pessoas_adicionados = 0;

    public Agenda(Pessoas[] agenda){
        this.agenda = agenda;
    }

    public Agenda(){
        System.out.println("Sua agenda está vazia e cabe até 10 pessoas");
    }

    public Pessoas[] getAgenda() {
        return this.agenda;
    }

    public void armazenaPessoa(Pessoas pessoa) {
        if (this.pessoas_adicionados < 10) {
            for(int i = 0; i < 10; i++) {
                if (this.agenda[i] == null) {
                    this.agenda[i] = pessoa;
                    this.pessoas_adicionados++;
                    System.out.println("Você adicionou com sucesso o contato");
                    break;
                }
            }
        } else {
            System.out.println("Você ja adicionou 10 pessoas.\nApague um contato para adicionar outro.");
        }
    }

    public void removePessoa(String nome) {
        boolean exist = false;
        if (this.pessoas_adicionados > 0) {
            for(int i = 0; i < 10; i++) {
                if (this.agenda[i] != null) {
                    if (this.agenda[i].getNome() == nome) {
                        this.agenda[i] = null;
                        this.pessoas_adicionados -= 1;
                        System.out.printf(nome + " foi removido da agenda com Sucesso.\n");
                        exist = true;
                        break;
                    }
                }
            }
        } else {
            System.out.println("Você não possui contatos");
        }
        if (exist == false){
            System.out.printf("Você não possui o contato de nome: "+nome+"\n");
        }
    }

    public void imprimeAgenda() {
        for(int i = 0; i < 10; i++) {
            if (this.agenda[i] != null) {
                System.out.printf("Nome: %s; Data de nascimento: %02d/%02d/%04d%n", agenda[i].getNome(), agenda[i].getDia(), agenda[i].getMes(), agenda[i].getAno());
            }
        }
    }

    public void buscaPessoa(String nome) {
        for(int i = 0; i < 100; i++) {
            if (this.agenda[i] != null) {
                if (this.agenda[i].getNome() == nome) {
                    System.out.println("Achei seu contato!!");
                    System.out.printf("Nome: %s; Data de nascimento: %02d/%02d/%04d%n", agenda[i].getNome(), agenda[i].getDia(), agenda[i].getMes(), agenda[i].getAno());
                    break;
                }
            }
        }
    }

    public void createPessoa(String nome, byte dia, byte mes, short ano) {
        armazenaPessoa((new Pessoas(nome, dia, mes, ano)));
    }

}
