package ru.netology.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void shouldSetRadioStation() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeLevel() {

        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(3);

        int expected = 3;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void nextStationAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void prevStationBeforeMinimal() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(98);

        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeAfterMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationNumber() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationNumberOverMaximum() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(11);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationNumberBelowZero() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}