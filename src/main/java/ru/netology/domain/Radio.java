package ru.netology.domain;

public class Radio {


    private int currentStation;

    private int currentSoundVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }


    }

    public void prev() {

        if (currentStation == 0) {
            currentStation = 9;
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
        if (newCurrentSoundVolume > 10) {
            currentSoundVolume = 10;
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseVolume() {
        if (currentSoundVolume == 10) {
            currentSoundVolume = 10;
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




