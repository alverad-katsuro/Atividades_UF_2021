package classes;

public class Agenda_telefonica {
    private Contato[] agenda = new Contato[100];
    private int contatos_adicionados = 0;

    public Agenda_telefonica(Contato[] agenda){
        this.agenda = agenda;
    }

    public Agenda_telefonica(){
        System.out.println("Sua agenda está vazia e cabe até 100 contatos");
    }

    public Contato[] getAgenda() {
        return this.agenda;
    }

    public void addContato(Contato contato) {
        if (this.contatos_adicionados < 100) {
            for(int i = 0; i < 100; i++) {
                if (this.agenda[i] == null) {
                    this.agenda[i] = contato;
                    this.contatos_adicionados++;
                    System.out.println("Você adicionou com sucesso o contato");
                    break;
                }
            }
        } else {
            System.out.println("Você ja adicionou 100 contatos.\nApague um contato para adicionar outro.");
        }
    }

    public void removeContato(String nome) {
        boolean exist = false;
        if (this.contatos_adicionados > 0) {
            for(int i = 0; i < 100; i++) {
                if (this.agenda[i] != null) {
                    if (this.agenda[i].getName() == nome) {
                        this.agenda[i] = null;
                        this.contatos_adicionados -= 1;
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

    public void buscaContato(String nome) {
        for(int i = 0; i < 100; i++) {
            if (this.agenda[i] != null) {
                if (this.agenda[i].getName() == nome) {
                    System.out.println("Achei seu contato!!");
                    System.out.printf("Nome: " + this.agenda[i].getName() + "\n");
                    System.out.printf("E-mail: " + this.agenda[i].getEmail() + "\n");
                    break;
                }
            }
        }
    }

    public void createContato(String nome, String email) {
        addContato((new Contato(nome, email)));
    }

}
