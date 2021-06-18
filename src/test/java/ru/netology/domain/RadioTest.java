package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void changeChanelUp() {
        Radio radio = new Radio(8,55);
        radio.increaseChanel();
        assertEquals(9,radio.getCurrentChanel());
    }

    @Test
    public void changeChanelUpMax() {
        Radio radio = new Radio(10,44);
        radio.increaseChanel();
        assertEquals(0, radio.getMinChannel());
    }

    @Test
    public void changeChanelDown() {
        Radio radio = new Radio(8,5);
        radio.decreaseChanel();
        assertEquals(7,radio.getCurrentChanel());
    }

    @Test
    public void changeChanelDownMin() {
        Radio radio = new Radio(0,10);;
        radio.decreaseChanel();
        assertEquals(10, radio.getMaxChannel());
    }

    @Test
    public void changeVolumeUp() {
        Radio radio = new Radio(5,55);
          radio.increaseVolume();
        assertEquals(56, radio.getCurrentVolume() );
    }

    @Test
    public void changeVolumeUpMax() {
        Radio radio = new Radio(5,100);
        radio.increaseVolume();
        assertEquals(100,radio.getMaxVolume());
    }

    @Test
    public void changeVolumeDown() {
        Radio radio = new Radio(8,67);
        radio.decreaseVolume();
        assertEquals(66,radio.getCurrentVolume());
    }

    @Test
    public void changeVolumeDownMin() {
        Radio radio = new Radio(7,-5);
        radio.decreaseVolume();
        assertEquals(0,radio.getMinVolume());
    }
}