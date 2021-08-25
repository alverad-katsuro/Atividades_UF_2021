package classes;

public class Retangle {
    float lenght=1f, widht =1f;


    public void perimetro() {
        System.out.println("O perimetro é "+ (getLenght() + getWidht()));
    }

    public void area(){
        System.out.println("A área é "+ (getLenght()*getWidht()));
    }

    public float getLenght() {
        return lenght;
    }

    public float getWidht() {
        return widht;
    }

    public void setLenght(float lenght) {
        if (lenght > 0 && lenght < 20) {
            this.lenght = lenght;
        } else{
            System.out.println("Valor fora do escopo 0<x<=20");
        }
    }
    public void setWidht(float widht) {
        if (widht > 0 && widht < 20) {
            this.widht = widht;
        } else{
            System.out.println("Valor fora do escopo 0<x<=20");
        }
    }
}
