import classes.Agenda_telefonica;

public class Meu_telefone {
    private static Agenda_telefonica agenda = new Agenda_telefonica();
    public static void main(String[] args) {
        agenda.createContato("Alfredo", "alfredo@gmail.com");
        agenda.buscaContato("Alfredo");
        agenda.createContato("Alfredoooooasd", "alfraaaedo@gmail.com");
        agenda.removeContato("Alfredo Gabriel");
        agenda.removeContato("Alfredo");
    }
}
