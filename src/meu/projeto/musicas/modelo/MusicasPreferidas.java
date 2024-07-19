package meu.projeto.musicas.modelo;

public class MusicasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " É considerado excelente entre os Usuários ");
        } else {
            System.out.println(audio.getTitulo() + " É considerado uma das melhores " +
                    "entre os Usuários");
        }
    }
}
