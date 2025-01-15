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
        this.currentStationNumber = newCurrentStationNumber;
    }

    //    сеттер для установки уровня громкости
    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        this.currentVolumeLevel = newCurrentVolumeLevel;
    }

    public void nextStation() {
        if (currentStationNumber == 9) {
            setCurrentStationNumber(0);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() + 1);
        }
    }

    public void prevStation() {
        if (currentStationNumber == 0) {
            setCurrentStationNumber(9);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() - 1);
        }
    }

    public void increaseVolume() {
        if (currentVolumeLevel == 100) {
            setCurrentVolumeLevel(100);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() + 1);
        }
    }

    public void decreaseVolume() {
        if (currentVolumeLevel == 0) {
            setCurrentVolumeLevel(0);
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() - 1);
        }
    }
}
