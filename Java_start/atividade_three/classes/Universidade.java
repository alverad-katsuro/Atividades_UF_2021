package classes;

public class Universidade {
    private String nome;   
    private Departamento[] departamentos = new Departamento[10];
    private int departamentos_add = 0;

    public Universidade(String nome){
        setNome(nome);
    }

    public Universidade(){
        System.out.println("Foi instanciada uma Universidade");
    }

    public void createDepartamento(String nome) {
        addDepartamento(new Departamento(nome));
    }

    public void exibeDepartamentos(){
        for(int i = 0; i < 10; i++) {
            if (this.departamentos[i] != null) {
                System.out.printf("Departamento: " + this.departamentos[i].getNome() + "\n");
                departamentos[i].exibePessoas();
            }
        }
    }

    public void addDepartamento (Departamento nome) {
        if (this.departamentos_add < 10) {
            for(int i = 0; i < 10; i++) {
                if (this.departamentos[i] == null) {
                    this.departamentos[i] = nome;
                    this.departamentos_add++;
                    System.out.println("Você adicionou com sucesso o departamento");
                    break;
                }
            }
        } else {
            System.out.println("Você ja adicionou 10 departamentos.");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
