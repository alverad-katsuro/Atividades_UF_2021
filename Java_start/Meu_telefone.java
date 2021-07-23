package Java_start;

import Java_start.atividades_java.*;

public class Meu_telefone {
    private static Agenda agenda = new Agenda();
    public static void main(String[] args) {
        agenda.createContato("Alfredo", "alfredo@gmail.com");
        agenda.buscaContato("Alfredo");
        agenda.createContato("Alfredoooooasd", "alfraaaedo@gmail.com");
        agenda.removeContato("Alfredo Gabriel");
        agenda.removeContato("Alfredo");
    }
}
