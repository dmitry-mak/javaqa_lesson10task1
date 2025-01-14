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
}