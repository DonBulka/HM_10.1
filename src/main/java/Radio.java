public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            return 9;
        }
        if (CurrentStation > 9) {
            return 0;
        }
        currentStation = CurrentStation;
        return CurrentStation;
    }

    public int setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < 0) {
            return 0;
        }
        if (CurrentVolume > 10) {
            return 10;
        }
        currentVolume = CurrentVolume;
        return CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        } else {
            currentVolume = 10;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }
}
