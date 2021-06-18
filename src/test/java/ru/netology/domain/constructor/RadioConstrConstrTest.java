package ru.netology.domain.constructor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioConstrConstrTest {
    @Test
    public void changeChanelUp () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,7,57);
        radioConstr.increaseChanel();
        assertEquals(radioConstr.getCurrentChanel(),8);
    }
//    @Test
//    public void changeChanelUpMaxNoArg() {
//        Radio radio = new Radio();
//            assertEquals(0, radio.getMaxVolume());
//        }

    @Test
    public void changeChanelUpMax () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,10,60);
        radioConstr.increaseChanel();
        assertEquals(radioConstr.getCurrentChanel(), radioConstr.getMinChannel());
    }
    @Test
    public void changeChanelDown () {
        RadioConstr radioConstr = new RadioConstr(100, 0, 10, 0, 8, 75);
        radioConstr.decreaseChanel();
        assertEquals(radioConstr.getCurrentChanel(),7);
    }

    @Test
    public void changeChanelDownMin () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,0,4);
        radioConstr.decreaseChanel();
        assertEquals(radioConstr.getCurrentChanel(), radioConstr.getMaxChannel());
    }
    @Test
    public void changeVolumeUp () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,8,5);
        radioConstr.increaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),6);
    }
    @Test
    public void changeVolumeDown () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,8,5);
        radioConstr.decreaseVolume();
        assertEquals(radioConstr.getCurrentVolume(),4);
    }
    @Test
    public void changeVolumeMaxUp () {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,2,100);
        radioConstr.increaseVolume();
        assertEquals(radioConstr.getCurrentVolume(), radioConstr.getMaxVolume());
    }
    @Test
    public void changeVolumeMinDown() {
        RadioConstr radioConstr = new RadioConstr(100,0,10,0,5,0);
        radioConstr.decreaseVolume();
        assertEquals(radioConstr.getCurrentVolume(), radioConstr.getMinVolume());
    }
//    @Test
//    public void checkCurrChanel() {
//        Radio radio = new Radio(100,0,10,0,9,4);
//        radio.setCurrentChanel(1);
//        assertEquals(radio.getCurrentChanel(),1);
//    }
//    @Test
//    public void checkCurrVol() {
//        Radio radio = new Radio(100,0,10,0,9,4);
//        radio.setCurrentVolume(1);
//        assertEquals(radio.getCurrentVolume(),1);
//    }

}