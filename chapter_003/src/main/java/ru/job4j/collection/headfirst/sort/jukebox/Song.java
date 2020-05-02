package ru.job4j.collection.headfirst.sort.jukebox;

import java.util.Objects;

public class Song implements Comparable<Song> {
    String title;
    String artiste;
    String rating;
    String bpm;

    Song(String t, String a, String r, String b) {
        title = t;
        artiste = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtiste() {
        return artiste;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    @Override
    public String toString() {
        return "Song{"
                + "title='" + title + '\'' + " : "
                + "artiste='" + artiste + '\''
                + '}';
    }

    @Override
    public int compareTo(Song s) {
        return this.getTitle().compareTo(s.getTitle());
    }

    @Override
    public boolean equals(Object o) {
        Song song = (Song) o;
        return getTitle().equals(song.getTitle());
    }

    @Override
    public int hashCode() {
        return getTitle().hashCode();
    }
}
