package ru.netology.oop2;

public class Radio {

    public int currentStationNumber;
    public int currentVolumeLevel;

//    геттер для получения текущего номера радиостанции
    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

//    геттер для получения текущего уровня громкости
    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

//   сеттер для установки номера радиостанции
    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

//    сеттер для установки уровня громкости
    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }


}
