package classes;

public class Vip extends Ingresso {
    @Override
    public float getValor() {
        return super.getValor() * 1.8f;
    }

    public String toString(){
        return "Ingresso Vip";
    } 
}
