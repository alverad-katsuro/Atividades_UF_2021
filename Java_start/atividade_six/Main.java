import java.util.Scanner;

import classes.Atividade;
import classes.Casa;
import classes.Retangle;

public class Main {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Casa casa = new Casa();
        casa.addBanheiro();
        casa.addCozinha();
        casa.addGaragem();
        casa.addSala();
        casa.addSala();
        casa.setEndereco();
        casa.descricaoCasa();
        Retangle retangulo = new Retangle();
        retangulo.setLenght(5.0f);
        retangulo.setWidht(6.0f);
        retangulo.area();
        retangulo.perimetro();
        Atividade atividade = new Atividade();
        atividade.product(sc);
        atividade.invert(sc);
        atividade.min(sc);
        atividade.distance(sc);
        atividade.fibonnaci(sc);
        sc.close();
    }
}
