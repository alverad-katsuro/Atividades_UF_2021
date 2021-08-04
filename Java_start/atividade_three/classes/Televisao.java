package classes;

public class Televisao {
    private int volume = 0;
    private int canal = 0;

    public void setCanal(int canal) {
        if (canal > 0){
            this.canal = canal;
            System.out.printf("O canal é %d%n", canal);
        } else {
            System.out.println("Canal invalido");
        }
    }

    public void setVolume(int volume) {
        if (volume > 0){
            this.volume = volume;
            System.out.printf("O volume esta em %d%% %n", volume);
        } else {
            System.out.println("Volume invalido");
        }
    }
    
    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
