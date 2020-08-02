class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {

        if (minutes < 59) {
            minutes++;
        } else if (minutes == 59) { //12:59
            minutes = 0;

            if (hours == 12) { // 1:00
                hours = 1;
            } else {
                hours++;
            }
        }
    }
}