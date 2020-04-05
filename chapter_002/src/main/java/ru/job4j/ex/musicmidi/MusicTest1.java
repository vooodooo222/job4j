package ru.job4j.ex.musicmidi;


import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;

public class MusicTest1 {
    public void test() {
        throw new Error();
    }

    public void play() {
        System.out.println("We got synthesizer");
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
        mt.test();
    }
}
