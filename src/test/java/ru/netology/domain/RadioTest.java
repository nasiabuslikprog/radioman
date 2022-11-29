package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetCurrentStationMax() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentStationMin() {
        Radio radio = new Radio( 15);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentStationNegative() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetCurrentStationNegativeMax() {
        Radio radio = new Radio(15);

        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public  void shouldSetStationMin(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldSetStationInBorden(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldSetStationMax(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(15);
        radio.next();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldSetStationPrevMin(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 14;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldSetStationPrevMax(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(9);
        radio.prev();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void shouldSetStationPrevInBorder(){
        Radio radio = new Radio(15);
        radio.setCurrentStation(8);
        radio.prev();
        int expected = 7;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }




    @Test
    public void shouldSetCurrentSoundVolumeMax() {
        Radio radio = new Radio(15);

        radio.setCurrentSoundVolume(100);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentSoundVolumeMin() {
        Radio radio = new Radio(15);

        radio.setCurrentSoundVolume(0);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void shouldSetCurrentSoundVolumeNegative() {
        Radio radio = new Radio(15);

        radio.setCurrentSoundVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldSetCurrentSoundVolumeNegativeMax() {
        Radio radio = new Radio(15);

        radio.setCurrentSoundVolume(110);

        int expected = 100;
        int actual = radio.getCurrentSoundVolume();

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public  void increaseVolumeVolumeMin(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void increaseVolumeInBorden(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(11);
        radio.increaseVolume();
        int expected = 12;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void increaseVolumeMax(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void decreaseVolumeMin(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void decreaseVolumeMax(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(100);
        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public  void decreaseVolumeVolumeInBorder(){
        Radio radio = new Radio(15);
        radio.setCurrentSoundVolume(90);
        radio.decreaseVolume();
        int expected = 89;
        int actual = radio.getCurrentSoundVolume();
        Assertions.assertEquals(expected, actual);
    }



}