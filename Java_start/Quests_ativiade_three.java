import atividade_three.classes.*;

public class Quests_ativiade_three {
    public static void main(String[] args) {
        Televisao tele = new Televisao();
        ControleRemoto control = new ControleRemoto(tele);
        control.aumenta_canal();
        control.aumenta_vol();
        control.aumenta_vol();
        control.aumenta_vol();
        control.aumenta_vol();
        control.aumenta_vol();
        control.volume_is();
        /*
        Elevador elevador = new Elevador(3, 3);
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        elevador.entra();
        Pessoas newton = new Pessoas("Isaac Newton", (byte)4, (byte)1, (short)1643);
        Pessoas albert = new Pessoas("Albert Einstein", (byte)14, (byte)3, (short)1879);
        Agenda agenda = new Agenda();
        agenda.armazenaPessoa(newton);
        agenda.armazenaPessoa(albert);
        agenda.imprimeAgenda();
        Universidade ufpa = new Universidade("UFPA");
        Departamento matematica = new Departamento("DEPARTAMENTO DE MATEMATICA");
        matematica.addPessoas(newton);
        matematica.addPessoas(albert);
        Departamento fisica = new Departamento("DEPARTAMENTO DE FISICA");
        fisica.addPessoas(newton);
        fisica.addPessoas(albert);
        Departamento biologia = new Departamento("DEPARTAMENTO DE BIOLOGIA");
        biologia.addPessoas(newton);
        biologia.addPessoas(albert);
        ufpa.addDepartamento(matematica);
        ufpa.addDepartamento(biologia);
        ufpa.addDepartamento(fisica);
        ufpa.exibeDepartamentos();
        albert.calculaIdade();
        newton.calculaIdade();
        */
    }
}
