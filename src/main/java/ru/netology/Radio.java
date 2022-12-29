package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void nextRadioStation() {
        int maxStation = 9;
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevRadioStation() {
        int maxStation = 9;
        int minStation = 0;
        if (currentStation == minStation) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void increaseVolume() {
        int maxVolume = 10;
        if (currentVolume >= maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume += 1;
        }
    }
    public void decreaseVolume() {
        int minVolume = 0;
        if (currentVolume <= minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume -= 1;
        }
    }
}