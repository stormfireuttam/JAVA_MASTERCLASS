package academy.learnprogramming;

public class Time {
    final int MAX_HOURS = 23;
    final int MAX_MIN_SECS = 59;

    int hour;    // current hour in military time
    int minute;  // current minute in military time
    int second;  // current second in military time

    // set the time to the time specified by the parameters
    void setTime(int newHour, int newMinute, int newSecond) {
        if (newHour >= 0 && newHour <= MAX_HOURS) {
            hour = newHour;
        }
        else {
            System.out.println("Error: hour must be between 0 and 23 inclusive");
            hour = 0;
        }

        if (newMinute >= 0 && newMinute <= MAX_MIN_SECS) {
            minute = newMinute;
        }
        else {
            System.out.println("Error: minute must be between 0 and 59 inclusive");
            minute = 0;
        }

        if (newSecond >= 0 && newSecond <= MAX_MIN_SECS) {
            second = newSecond;
        }
        else {
            System.out.println("Error: second must be between 0 and 59 inclusive");
            second = 0;
        }
    }

    // return the time to the calling method in a three-membered array
    int[] getTime() {
        return new int[] {hour, minute, second};
    }

    // increment the current time by one second
    void incrementTime () {
        second = ++second % (MAX_MIN_SECS + 1);

        if(second == 0) {
            minute = ++minute % (MAX_MIN_SECS + 1);
        }
        if(minute == 0) {
            hour = ++hour % (MAX_HOURS + 1);
        }
    }

}

