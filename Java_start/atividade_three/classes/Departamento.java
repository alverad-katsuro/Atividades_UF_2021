package classes;

public class Departamento {
    private String nome;
    private Pessoa[] pessoas = new Pessoa[10];
    private int pessoas_add = 0;

    public Departamento(String nome){
        setNome(nome);
    }

    public Departamento(){
        System.out.println("Foi instanciada uma Departamento");
    }

    public void buscaPessoa(String nome) {
        for(int i = 0; i < 10; i++) {
            if (this.pessoas[i] != null) {
                if (this.pessoas[i].getNome() == nome) {
                    System.out.printf("Nome: " + this.pessoas[i].getNome() + "\n");
                    break;
                }
            }
        }
    }

    public void exibePessoas() {
        for(int i = 0; i < 10; i++) {
            if (this.pessoas[i] != null) {
                System.out.printf("Nome: " + this.pessoas[i].getNome() + "\n");
            }
        }
    }

    public void addPessoas (Pessoa nome) {
        if (this.pessoas_add < 10) {
            for(int i = 0; i < 10; i++) {
                if (this.pessoas[i] == null) {
                    this.pessoas[i] = nome;
                    this.pessoas_add++;
                    System.out.println("Você adicionou com sucesso a pessoa");
                    break;
                }
            }
        } else {
            System.out.println("Você ja adicionou 10 pessoas.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
