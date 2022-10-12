import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentAboveStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCurrentBelowStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSwitchOverMaxStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        int expected = 7;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSwitchBelowMinStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);

        int actual = radio.getCurrentVolume();
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldAboveVolume() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.setCurrentVolume(15);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldBelowVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ShouldNotIncreaseLimitVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(8);

        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotDecreaseLimitVolumeBelow() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }



}




