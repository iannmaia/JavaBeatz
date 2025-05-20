package br.com.javabeatz.principal;

import br.com.javabeatz.modelos.MinhasPreferidas;
import br.com.javabeatz.modelos.Musica;
import br.com.javabeatz.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Anos luz");
        minhaMusica.setArtista("Matuê");

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 40; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);
    }
}
