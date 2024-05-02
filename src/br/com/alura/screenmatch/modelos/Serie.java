package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int EpisodiosPorTemporada;
    private int minutosPorEpisodios;

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return EpisodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.EpisodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getRunningTime() {
        return temporadas * EpisodiosPorTemporada * minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " +
                this.getName()
                + " (" +
                this.getReleaseDate() +
                ")";
    }
}
