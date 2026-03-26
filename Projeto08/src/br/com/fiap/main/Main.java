package br.com.fiap.main;

import br.com.fiap.bean.Radio;
import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
//        Radio radio = new Radio();
//        radio.setVolume(399);
//        radio.setEstacao(89.1f);
//        radio.aumentarVolume();
//        radio.aumentarVolume();
//        radio.aumentarVolume();
//        System.out.printf("Estação: %.1f\nVolume: %d\n", radio.getEstacao(), radio.getVolume());
//    Teste mogado:
        Televisor televisor = new Televisor();
        televisor.setVolume(23);
        televisor.maisVolume();
        televisor.maisVolume();
        televisor.maisVolume();
        televisor.setCanal(11);
        System.out.printf("Canal: %d\nVolume: %d\n", televisor.getCanal(), televisor.getVolume());
    }
}
