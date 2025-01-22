package ru.netology.oop2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Radio {

    private static final int MIN_STATION = 0;
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private int currentStationNumber;
    private int currentVolumeLevel;
    private int numberOfStations = 10;


    // Перегруженный конструктор, устанавливает заданное кол-во станций
    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.currentStationNumber = MIN_STATION;
        this.currentVolumeLevel = MIN_VOLUME;
    }

    // Сеттер для установки номера радиостанции
    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber >= numberOfStations) {
            currentStationNumber = numberOfStations - 1;
        } else if (newCurrentStationNumber < MIN_STATION) {
            currentStationNumber = MIN_STATION;
        } else {
            this.currentStationNumber = newCurrentStationNumber;
        }
    }

    // Сеттер для установки уровня громкости
    public void setCurrentVolumeLevel(int newCurrentVolumeLevel) {
        if (newCurrentVolumeLevel > MAX_VOLUME) {
            currentVolumeLevel = MAX_VOLUME;
        } else if (newCurrentVolumeLevel < MIN_VOLUME) {
            currentVolumeLevel = MIN_VOLUME;
        } else {
            this.currentVolumeLevel = newCurrentVolumeLevel;
        }
    }

    // Увеличение значения номера радиостанции на единицу
    public void nextStation() {
        if (currentStationNumber == numberOfStations - 1) {
            setCurrentStationNumber(MIN_STATION);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() + 1);
        }
    }

    // Уменьшение значения номера радиостанции на единицу
    public void prevStation() {
        if (currentStationNumber == MIN_STATION) {
            setCurrentStationNumber(numberOfStations - 1);
        } else {
            setCurrentStationNumber(getCurrentStationNumber() - 1);
        }
    }

    // Увеличение громкости на единицу
    public void increaseVolume() {
        if (currentVolumeLevel == MAX_VOLUME) {
            return;
        } else {
            setCurrentVolumeLevel(getCurrentVolumeLevel() + 1);
        }
    }

    // Уменьшение громкости на единицу
    public void decreaseVolume() {
        setCurrentVolumeLevel(Math.max(currentVolumeLevel - 1, MIN_VOLUME));
    }
}
