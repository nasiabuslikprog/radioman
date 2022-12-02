package ru.netology.domain;

public class Radio {


    private int currentStation;

    private int currentSoundVolume;
    private int stationAmount;

    public Radio() {
        stationAmount = 10;
    }

    public Radio(int stationAmount) {

        this.stationAmount = stationAmount;

    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > stationAmount - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next() {
        if (currentStation == stationAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }


    }

    public void prev() {

        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }


    }

    public int getCurrentSoundVolume() {

        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {

        if (newCurrentSoundVolume < 0) {
            currentSoundVolume = 0;
            return;
        }
        if (newCurrentSoundVolume > 100) {

            currentSoundVolume = 100;

            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume == 100) {

            currentSoundVolume = 100;
        } else {
            currentSoundVolume++;
        }
    }


    public void decreaseVolume() {

        if (currentSoundVolume == 0) {
            currentSoundVolume = 0;
        } else {
            currentSoundVolume--;
        }
    }


}




