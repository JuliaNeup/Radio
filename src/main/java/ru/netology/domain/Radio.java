package ru.netology.domain;

public class Radio {
    private int maxVolume = 9;
    private int minVolume = 0;
    private int maxChannel = 9;
    private int minChannel = 0;
    int currentChanel;
    int currentVolume;

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

    public void setCurrentChanel(int newCurrentChanel) {
        this.currentChanel = newCurrentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        this.currentVolume = newCurrentVolume;
    }

    void decreaseChanel() {
        if (currentChanel > minChannel) {
            currentChanel = currentChanel - 1;
        }
    }

    void increaseChanel() {
        if (currentChanel < maxChannel) {
            currentChanel = currentChanel + 1;
        }
    }

    void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}