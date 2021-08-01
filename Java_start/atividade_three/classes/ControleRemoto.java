package atividade_three.classes;

public class ControleRemoto {
    private Televisao televisao;
    
    public ControleRemoto(Televisao televisao){
        setTelevisao(televisao);   
    }

    public void aumenta_vol() {
        televisao.setVolume(televisao.getVolume() + 1);
    }

    public void diminui_vol() {
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void aumenta_canal() {
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminui_canal() {
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void canal_set(int canal) {
        televisao.setCanal(canal);
    }

    public void volume_is() {
        System.out.printf("O volume está em %d%% %n", televisao.getVolume());
    }

    public void canal_is() {
        System.out.printf("O canal atual é %d%n", televisao.getCanal());
    }

    public Televisao getTelevisao() {
        return televisao;
    }

    public void setTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }
}
