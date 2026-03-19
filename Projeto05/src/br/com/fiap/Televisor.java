package br.com.fiap;
public class Televisor {
    public int volume;
    public float canal;
    public void aumentarVolume() {
        volume ++;
    }
    public void diminuirVolume() {
        volume --;
    }
    public void trocarCanal(float numCanal) {
        canal = numCanal;
    }
    public static void main(String[] args) {
        // mock test
        Televisor televisor1 = new Televisor();
        televisor1.canal = 4.4f;
        televisor1.volume = 56;
        televisor1.trocarCanal(8.0f);
        televisor1.diminuirVolume();
        televisor1.aumentarVolume();
        televisor1.aumentarVolume();
        System.out.println("Canal atual: " + televisor1.canal + "\nVolume: " + televisor1.volume);
    }
}
