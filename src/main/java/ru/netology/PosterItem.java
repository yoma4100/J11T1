package ru.netology;

public class PosterItem {
    private int filmId;
    private String filmName;

    public PosterItem(int filmId, String filmName) {
        this.filmId = filmId;
        this.filmName = filmName;
    }

    public int getFilmId() {
        return filmId;
    }

    public String getFilmName() {
        return filmName;
    }
}
