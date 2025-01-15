package ru.netology.oop2;

public class Radio {

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
        if (newCurrentStationNumber > 9) {
            currentStationNumber = 9;
        } else if (newCurrentStationNumber < 0) {
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
        if (currentStationNumber == 9) {
            setCurrentStationNumber(0);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() + 1);
        }
    }

    //    уменьшение значения номера радиостанции на единицу
    public void prevStation() {
        if (currentStationNumber == 0) {
            setCurrentStationNumber(9);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() - 1);
        }
    }

    //    увеличение громкости на единицу
    public void increaseVolume() {
        if (currentVolumeLevel == 100) {
            setCurrentVolumeLevel(100);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() + 1);
        }
    }

    //    уменьшение громкости на единицу
    public void decreaseVolume() {
        if (currentVolumeLevel == 0) {
            setCurrentVolumeLevel(0);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() - 1);
        }
    }
}
