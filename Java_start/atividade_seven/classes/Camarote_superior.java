package classes;

public class Camarote_superior extends Vip {
    private String local = "2º Andar";

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public float getValor() {
        return super.getValor() * 5;
    }
}
