package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(6);

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationMax(){
        Radio stat = new Radio();

        stat.setCurrentStation(9);
        stat.nextRadioStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNumber(){
        Radio stat = new Radio();

        stat.setCurrentStation(5);
        stat.nextRadioStation();

        int expected = 6;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationMin(){
        Radio stat = new Radio();

        stat.setCurrentStation(0);
        stat.prevRadioStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationNumber(){
        Radio stat = new Radio();

        stat.setCurrentStation(5);
        stat.prevRadioStation();

        int expected = 4;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio stat = new Radio();

        stat.setCurrentVolume(11);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio stat = new Radio();

        stat.setCurrentVolume(-1);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio stat = new Radio();

        stat.setCurrentVolume(5);
        stat.increaseVolume();

        int expected = 6;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeMore(){
        Radio stat = new Radio();

        stat.setCurrentVolume(10);
        stat.increaseVolume();

        int expected = 10;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio stat = new Radio();

        stat.setCurrentVolume(5);
        stat.decreaseVolume();

        int expected = 4;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolumeUnder(){
        Radio stat = new Radio();

        stat.setCurrentVolume(-1);
        stat.decreaseVolume();

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


