package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void changeChanelUp () {
        Radio radio = new Radio();
        int chanel = 5;
        radio.setCurrentChanel(chanel);
        radio.increaseChanel();
        assertEquals(radio.getCurrentChanel(),chanel+1);
    }
    @Test
    public void changeChanelUpMax () {
        Radio radio = new Radio();
        int chanel = radio.getMaxChannel();
        radio.setCurrentChanel(chanel);
        radio.increaseChanel();
        assertEquals(radio.getCurrentChanel(),chanel);
    }
    @Test
    public void changeChanelDown () {
        Radio radio = new Radio();
        int chanel = 5;
        radio.setCurrentChanel(chanel);
        radio.decreaseChanel();
        assertEquals(radio.getCurrentChanel(),chanel-1);
    }
    @Test
    public void changeChanelDownMin () {
        Radio radio = new Radio();
        int chanel = radio.getMinChannel();
        radio.setCurrentChanel(chanel);
        radio.decreaseChanel();
        assertEquals(radio.getCurrentChanel(),chanel);
    }
    @Test
    public void changeVolumeUp () {
        Radio radio = new Radio();
        int volume = 8;
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        assertEquals(radio.getCurrentVolume(),volume+1);
    }
    @Test
    public void changeVolumeUpMax () {
        Radio radio = new Radio();
        int volume = radio.getMaxVolume();
        radio.setCurrentVolume(volume);
        radio.increaseVolume();
        assertEquals(radio.getCurrentVolume(),volume);
    }
    @Test
    public void changeVolumeDown () {
        Radio radio = new Radio();
        int volume = 5;
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        assertEquals(radio.getCurrentVolume(),volume-1);
    }
    @Test
    public void changeVolumeDownMin () {
        Radio radio = new Radio();
        int volume = radio.getMinVolume();
        radio.setCurrentVolume(volume);
        radio.decreaseVolume();
        assertEquals(radio.getCurrentVolume(),volume);
    }

}