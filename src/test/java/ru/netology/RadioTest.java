package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void selectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void miniSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(-1);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void excessSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void translationIntoNextSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(4);

        radio.next();

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.next();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void translationIntoPrevSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(7);

        radio.prev();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minSelectRadioStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void selectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(6);

        int expected = 6;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void miniselectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(-1);

        int expected = 0;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void excessSelectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(11);

        int expected = 0;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void translationIntoNextSelectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(6);

        radio.nextVolume();

        int expected = 7;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxSelectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(10);

        radio.nextVolume();

        int expected = 10;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void translationIntoPrevSelectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(4);

        radio.prevVolume();

        int expected = 3;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSelectRadioVolume() {
        Radio radio = new Radio();
        radio.setRadioSoundVolume(0);

        radio.prevVolume();

        int expected = 0;
        int actual = radio.getRadioSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}