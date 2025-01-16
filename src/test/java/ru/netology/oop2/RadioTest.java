package ru.netology.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    //    Должен устанавливать указанный номер станции
    @Test
    void shouldSetCurrentStationNumber() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //   Должен устанавливать указанный уровень громкости
    @Test
    void shouldSetCurrentVolumeLevel() {

        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(23);

        int expected = 23;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    //    нижние граничные значения для номера радиостанции (-1;0;1)
    @Test
    public void setRadioStation_lowerBoundaryValues() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Radio radio1 = new Radio();
        radio1.setCurrentStationNumber(0);
        int expected1 = 0;
        int actual1 = radio1.getCurrentStationNumber();

        Radio radio2 = new Radio();
        radio2.setCurrentStationNumber(1);
        int expected2 = 1;
        int actual2 = radio2.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    //    верхние граничные значения для номера радиостанции (8;9;10)
    @Test
    public void setRadioStation_upperBoundaryValues() {

        Radio radio = new Radio();
        radio.setCurrentStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Radio radio1 = new Radio();
        radio1.setCurrentStationNumber(9);
        int expected1 = 9;
        int actual1 = radio1.getCurrentStationNumber();

        Radio radio2 = new Radio();
        radio2.setCurrentStationNumber(10);
        int expected2 = 9;
        int actual2 = radio2.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    //    нижние граничные значения для уровня громкости (-1;0;1)
    @Test
    public void setVolume_lowerBoundaryValues() {

        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(-1);
        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Radio radio1 = new Radio();
        radio1.setCurrentVolumeLevel(0);
        int expected1 = 0;
        int actual1 = radio1.getCurrentVolumeLevel();

        Radio radio2 = new Radio();
        radio2.setCurrentVolumeLevel(1);
        int expected2 = 1;
        int actual2 = radio2.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }

    //    верхние граничные значения для уровня громкости (99;100;101)
    @Test
    public void setVolume_upperBoundaryValues() {

        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(99);
        int expected = 99;
        int actual = radio.getCurrentVolumeLevel();

        Radio radio1 = new Radio();
        radio1.setCurrentVolumeLevel(100);
        int expected1 = 100;
        int actual1 = radio1.getCurrentVolumeLevel();

        Radio radio2 = new Radio();
        radio2.setCurrentVolumeLevel(101);
        int expected2 = 100;
        int actual2 = radio2.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertEquals(expected2, actual2);
    }


    // переход на следующую радиостанцию
    @Test
    void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // переход на следующую радиостанцию после максимальной. Должен передавать минимальное значение радиостанции
    @Test
    void nextStationAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    // переход на предыдущую радиостанцию.
    @Test
    void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //   переход на предыдущую радиостанцию после минимальной. Должен передавать максимальное значение радиостанции
    @Test
    void prevStationBeforeMinimal() {
        Radio radio = new Radio();
        radio.setCurrentStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    //   увеличение уровня громкости на единицу
    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(98);

        radio.increaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    //   увеличение уровня громкости после максимального. Должен оставлять максимальное значение громкости
    @Test
    void increaseVolumeAfterMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    //   уменьшение уровня громкости на единицу
    @Test
    void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }

    //    уменьшение уровня громкости после минимального. Должен оставлять минимальное значение громкости
    @Test
    void decreaseVolumeAfterMinimum() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolumeLevel();

        Assertions.assertEquals(expected, actual);
    }


}