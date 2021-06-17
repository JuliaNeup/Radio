package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void changeChanelUp () {
        Radio radioConstr = new Radio();
        int chanel = 5;
        radioConstr.setCurrentChanel(chanel);
        radioConstr.increaseChanel();
        assertEquals(radioConstr.getCurrentChanel(), chanel+1);
    }
    @Test
    public void changeChanelUpMax () {
        Radio radioConstr = new Radio();
        int chanel = radioConstr.getMaxChannel();
        radioConstr.setCurrentChanel(chanel);
        radioConstr.increaseChanel();
        assertEquals(radioConstr.getCurrentChanel(), radioConstr.getMinChannel());
    }
    @Test
    public void changeChanelDown () {
        Radio radioConstr = new Radio();
        int chanel = 4;
        radioConstr.setCurrentChanel(chanel);
        radioConstr.decreaseChanel();
        assertEquals(radioConstr.getCurrentChanel(),chanel-1);
    }
    @Test
    public void changeChanelDownMin () {
        Radio radioConstr = new Radio();
        int chanel = radioConstr.getMinChannel();
        radioConstr.setCurrentChanel(chanel);
        radioConstr.decreaseChanel();
        assertEquals(radioConstr.getCurrentChanel(), radioConstr.getMaxChannel());
    }
    @Test
    public void changeVolumeUp () {
        Radio radioConstr = new Radio();
        int volume = 8;
        radioConstr.setCurrentVolume(volume);
        radioConstr.increaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),volume+1);
    }
    @Test
    public void changeVolumeUpMax () {
        Radio radioConstr = new Radio();
        int volume = radioConstr.getMaxVolume();
        radioConstr.setCurrentVolume(volume);
        radioConstr.increaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),volume);
    }
    @Test
    public void changeVolumeDown () {
        Radio radioConstr = new Radio();
        int volume = 2;
        radioConstr.setCurrentVolume(volume);
        radioConstr.decreaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),volume-1);
    }
    @Test
    public void changeVolumeDownMin () {
        Radio radioConstr = new Radio();
        int volume = radioConstr.getMinVolume();
        radioConstr.setCurrentVolume(volume);
        radioConstr.decreaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),volume);
    }

}