package ru.netology.HW_7_10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class RadioTest {

    @ParameterizedTest
    @CsvFileSource(resources = "setStationParameter.csv")
    public void shouldSetCurrentStationParametrized(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая радиостанция " + radio.getCurrentStation());
    }

//    @Test
//    public void shouldSetStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//        System.out.println("Текущая радиостанция " + radio.getCurrentStation());
//    }


    @ParameterizedTest
    @CsvFileSource(resources = "nextStationParameter.csv")
    public void shouldSetNextStationParametrized(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
        radio.nextStation();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println("Следующая радиостанция " + radio.getCurrentStation());
    }

//    @Test
//    public void shouldSetNextStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(9);
//        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
//        radio.nextStation();
//
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//        System.out.println("Следующая радиостанция " + radio.getCurrentStation());
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "prevStationParameter.csv")
    public void shouldSetPrevStationParametrized(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
        radio.prevStation();

        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
        System.out.println("Предыдущая радиостанция " + radio.getCurrentStation());
    }


//    @Test
//    public void shouldSetPrevStation() {
//        Radio radio = new Radio();
//
//        radio.setCurrentStation(0);
//        System.out.print("Текущая радиостанция " + radio.getCurrentStation() + ", ");
//        radio.prevStation();
//
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//        System.out.println("Предыдущая радиостанция " + radio.getCurrentStation());
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "setVolumeParameter.csv")
    public void shouldSetCurrentVolumeParametrized(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println("Текущая громкость " + radio.getCurrentVolume());
    }

//    @Test
//    public void shouldSetVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(-10);
//
//        int expected = 0;
//        int actual = radio.getCurrentVolume();
//
//        Assertions.assertEquals(expected, actual);
//        System.out.println("Текущий уровень громкости  " + radio.getCurrentVolume());
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "increaseVolumeParameter.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        System.out.print("Текущий уровень громкости  " + radio.getCurrentVolume() + ", ");
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println("После повышение получаем " + radio.getCurrentVolume());
    }

//    @Test
//    public void increaseVolume() {
//        Radio radio = new Radio();
//
//        radio.setCurrentVolume(101);
//        System.out.print("Прошлый уровень громкости  " + radio.getCurrentVolume() + ", ");
//        radio.increaseVolume();
//
//        int expected = 100;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//        System.out.println("Новый уровень громкости  " + radio.getCurrentVolume());
//    }

    @ParameterizedTest
    @CsvFileSource(resources = "decreaseVolumeParameter.csv")
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        System.out.print("Текущий уровень громкости " + radio.getCurrentVolume() + ", ");
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
        System.out.println("После уменьшения получаем " + radio.getCurrentVolume());
    }

//    @Test
//    public void decreaseVolume() {
//        Radio radio = new Radio();
//        radio.setCurrentVolume(101);
//
//        System.out.print("Текущий уровень громкости  " + radio.getCurrentVolume() + ", ");
//
//        radio.decreaseVolume();
//
//        int expected = 99;
//        int actual = radio.getCurrentVolume();
//        Assertions.assertEquals(expected, actual);
//        System.out.println("После уменьшения получаем  " + radio.getCurrentVolume());
//    }

}