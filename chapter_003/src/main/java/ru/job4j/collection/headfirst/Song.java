package ru.job4j.collection.headfirst;

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
                + "title='" + title + '\''
                + '}';
    }

    @Override
    public int compareTo(Song s) {
        return this.getTitle().compareTo(s.getTitle());
    }
}
