package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio stat = new Radio();

        stat.setCurrentStation(5);

        int expected = 5;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMaxStation(){
        Radio stat = new Radio();

        stat.setToMaxStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinStation(){
        Radio stat = new Radio();

        stat.setToMinStation();

        int expected = 0;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation(){
        Radio stat = new Radio();

        stat.setCurrentStation(9);
        stat.nextStation();

        int expected = 9;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldPrevStation(){
        Radio stat = new Radio();

        stat.setCurrentStation(9);
        stat.prevStation();

        int expected = 8;
        int actual = stat.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVolume(){
        Radio stat = new Radio();

        stat.setToMaxVolume();

        int expected = 10;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetToMinVolume(){
        Radio stat = new Radio();

        stat.setToMinVolume();

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetVolumeAboveMax(){
        Radio stat = new Radio();

        stat.setCurrentVolume(30);

        int expected = 0;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume(){
        Radio stat = new Radio();

        stat.setCurrentVolume(10);
        stat.increaseVolume();

        int expected = 11;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolume(){
        Radio stat = new Radio();

        stat.setCurrentVolume(10);
        stat.decreaseVolume();

        int expected = 9;
        int actual = stat.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }
}
