package ru.netology.oop2;

public class Radio {

    private static final int MIN_STATION = 0;
    private static final int MAX_STATION = 9;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private int currentStationNumber;
    private int currentVolumeLevel;

    //    геттер для получения текущего номера радиостанции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    //    геттер для получения текущего уровня громкости
    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    //   сеттер для установки номера радиостанции
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber > MAX_STATION) {
            currentStationNumber = 9;
        } else if (newCurrentStationNumber < MIN_STATION) {
            currentStationNumber = 0;
        } else {
            this.currentStationNumber = newCurrentStationNumber;
        }
    }

    //    сеттер для установки уровня громкости
    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        this.currentVolumeLevel = newCurrentVolumeLevel;
    }

    //    увеличение значения номера радиостанции на единицу
    public void nextStation() {
        if (currentStationNumber == MAX_STATION) {
            setCurrentStationNumber(MIN_STATION);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() + 1);
        }
    }

    //    уменьшение значения номера радиостанции на единицу
    public void prevStation() {
        if (currentStationNumber == MIN_STATION) {
            setCurrentStationNumber(MAX_STATION);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() - 1);
        }
    }

    //    увеличение громкости на единицу
    public void increaseVolume() {
        if (currentVolumeLevel == MAX_VOLUME) {
            setCurrentVolumeLevel(MAX_VOLUME);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() + 1);
        }
    }

    //    уменьшение громкости на единицу
    public void decreaseVolume() {
        if (currentVolumeLevel == MIN_VOLUME) {
            setCurrentVolumeLevel(MIN_VOLUME);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() - 1);
        }
    }
}
