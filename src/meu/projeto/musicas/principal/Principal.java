package meu.projeto.musicas.principal;

import meu.projeto.musicas.modelo.Musica;
import meu.projeto.musicas.modelo.MusicasPreferidas;
import meu.projeto.musicas.modelo.PodCast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        PodCast meuPodcast = new PodCast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MusicasPreferidas preferida = new MusicasPreferidas();
        preferida.inclui(meuPodcast);
        preferida.inclui(minhaMusica);
    }
}
