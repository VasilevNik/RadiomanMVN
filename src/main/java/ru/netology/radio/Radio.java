package ru.netology.radio;

public class Radio {

    public int currentRadioStation;

    public void next() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = 9;
        }
    }

    public int changeRadioStation;

    public int getChangeRadioStation() {
        return changeRadioStation;
    }

    public void setChangeRadioStation(int changeRadioStation) {
        if (changeRadioStation > 9) {
            return;
        }
        if (changeRadioStation < 0) {
            return;
        }
        this.changeRadioStation = changeRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int currentSoundLevel;

    public int getCurrentSoundLevel() {
        return currentSoundLevel;
    }

    public void setCurrentSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel < 0) {
            return;
        }
        if (currentSoundLevel > 10) {
            return;
        }
        this.currentSoundLevel = currentSoundLevel;
    }

    public void volumePlus() {
        if (currentSoundLevel < 10) {
            currentSoundLevel++;
        }
    }

    public void volumeMinus() {
        if (currentSoundLevel > 0) {
            currentSoundLevel--;
        }
    }
}
