package ru.netology.domain.constructor;

public class RadioConstr {
    private int maxVolume;
    private int minVolume;
    private int maxChannel;
    private int minChannel;
    int currentChanel;
    int currentVolume;

    public RadioConstr(int maxVolume, int minVolume, int maxChannel, int minChannel, int currentChanel, int currentVolume) {
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.maxChannel = maxChannel;
        this.minChannel = minChannel;
        this.currentChanel = currentChanel;
        this.currentVolume = currentVolume;
    }
    public RadioConstr(){

    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxChannel() {
        return maxChannel;
    }

    public int getMinChannel() {
        return minChannel;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void decreaseChanel() {
        if (currentChanel > minChannel) {
            currentChanel--;
        }
        else {
            currentChanel=maxChannel;
        }
    }

    public void increaseChanel() {
        if (currentChanel < maxChannel) {
            currentChanel ++;
        } else  {
            currentChanel= minChannel;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } if (currentVolume >= maxVolume) {
            currentVolume=maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        }
    }
}