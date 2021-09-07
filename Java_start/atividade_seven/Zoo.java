import classes.*;

public class Zoo extends Animal {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", "Mel", "Amarelo", "Terra", 150, 4, 2.0f);
        Mamifero urso = new Mamifero("Urso-do-Canadá", "Mel", "Vermelho", "Terra", 180, 4, 0.5f);
        Peixe tuba = new Peixe("Tubarão", "Barbatana e cauda", "Cinzento", "Mar", 300, 0, 1.5f);
        Zoologico zoo = new Zoologico();
        zoo.addAnimal(camelo);
        zoo.addAnimal(urso);
        zoo.addAnimal(tuba);
        zoo.exibeTudo();
        Menu_ingresso.chama_menu();
    }
}
