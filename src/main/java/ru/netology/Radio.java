package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int maxStation;

    public Radio(){
        maxStation = 9;
    }
    public Radio(int stationsCount){
        maxStation = stationsCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void nextRadioStation() {
        if (currentStation >= maxStation) {
            currentStation = 0;
        } else {
            currentStation += 1;
        }
    }

    public void prevRadioStation() {
        if (currentStation == 0) {
            currentStation = maxStation;
        } else {
            currentStation -= 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void increaseVolume() {
        if (currentVolume >= 100) {
            currentVolume = 100;
        } else {
            currentVolume += 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume -= 1;
        }
    }
}