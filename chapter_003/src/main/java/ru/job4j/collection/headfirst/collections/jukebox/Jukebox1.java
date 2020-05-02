package ru.job4j.collection.headfirst.collections.jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class Jukebox1 {
    /**
     * Названия песен
     */
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox1().go();
    }

    /**
     * Загружает файл и выводит содержимое
     * из списка названия песен
     */
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<>();    // duplicates have disappeared sorting is restored. But "Song" need implements Comparable (compareTo)
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    /**
     * Считывает файл и вызывает для каждой его строки
     * метод addSong
     */
    void getSongs() {
        try {
            String workingDirectory = System.getProperty("user.dir");
            System.out.println("Working Directory = " + workingDirectory);
            String songListFilePath = workingDirectory + "\\chapter_003\\src\\main\\java\\ru\\job4j\\collection\\headfirst\\collections\\jukebox\\SongList.txt";
            File file = new File(songListFilePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Разбивает строку на две части по символу '/' и
     * добавляет в список название песни
     * @param lineToParse - строка для разбора
     */
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
    }

    public class ArtistComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getArtiste().compareTo(o2.getArtiste());
        }
    }

    public class TitleComparator implements Comparator<Song> {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
