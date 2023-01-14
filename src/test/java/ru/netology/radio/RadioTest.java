package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationBelowNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationAboveNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseNextOnRadioStationNine() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void chooseNextOnRadioStationEight() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosePrevRadioStationFromTheValueZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosePrevRadioStationFromTheValueOne() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumber() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(5);

        int expected = 5;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberNine() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(9);

        int expected = 9;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberBelowNine() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(8);

        int expected = 8;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberAboveNine() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(10);

        int expected = 0;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberNumberZero() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(0);

        int expected = 0;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberBelowZero() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(-1);

        int expected = 0;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changeRadioStationToNumberAboveZero() {
        Radio radio = new Radio();

        radio.setChangeRadioStation(1);

        int expected = 1;
        int actual = radio.getChangeRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevel() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(5);

        int expected = 5;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(0);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelAboveZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(1);

        int expected = 1;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelBelowTen() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(9);

        int expected = 9;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelTen() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(10);

        int expected = 10;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetSoundLevelAboveTen() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(11);

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(5);

        radio.volumePlus();

        int expected = 6;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeAboveTen() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(10);

        radio.volumePlus();

        int expected = 10;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeFromNine() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(9);

        radio.volumePlus();

        int expected = 10;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void loweringTheVolume() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(5);

        radio.volumeMinus();

        int expected = 4;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void loweringTheVolumeFromOne() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(1);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void loweringTheVolumeBelowZero() {
        Radio radio = new Radio();

        radio.setCurrentSoundLevel(0);

        radio.volumeMinus();

        int expected = 0;
        int actual = radio.getCurrentSoundLevel();
        Assertions.assertEquals(expected, actual);
    }
}
