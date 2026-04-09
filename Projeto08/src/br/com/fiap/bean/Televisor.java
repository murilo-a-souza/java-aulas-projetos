package br.com.fiap.bean;

public class Televisor {
    private int volume;
    private int canal;
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        try {
            if (volume >= 0 && volume <= 20) {
                this.volume = volume;
            } else {
                throw new Exception("Volume não permitido (min=0 e max=20)");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        try {
            if (canal == 2 || canal == 4 || canal == 5 || canal == 7 || canal == 13) {
                this.canal = canal;
            } else {
                this.canal = 2;
                throw new Exception("Canal indisponível. Apenas: 2, 4, 5, 7, e 13");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    // particulares
    public void maisVolume() {
        if (volume >= 0 && volume < 20) {
            volume++;
        }
    }
    public void menosVolume() {
        if (volume > 0 && volume <= 20) {
            volume--;
        }
    }
}
