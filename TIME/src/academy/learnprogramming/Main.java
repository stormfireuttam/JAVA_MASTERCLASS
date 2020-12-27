package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        Time currTime = new Time();  // object that stores the current time
        int hr;         // current hour obtained from currTime
        int min;        // current minute obtained from currTime
        int sec;        // current second obtained from currTime

        int[] temp;		// for using getTime()

        temp = currTime.getTime();
        hr = temp[0];
        min = temp[1];
        sec = temp[2];

        System.out.println(
                "The initial military time is set to: "
                        + hr + ":" + min + ":" + sec
        );


        currTime.setTime(20, 15, 43);
        temp = currTime.getTime();
        hr = temp[0];
        min = temp[1];
        sec = temp[2];

        System.out.println(
                "The current military time is set to: "
                        + hr + ":" + min + ":" + sec
        );


        currTime.incrementTime();
        temp = currTime.getTime();
        hr = temp[0];
        min = temp[1];
        sec = temp[2];

        System.out.println(
                "After incrementing the time, the current military time is: "+ hr + ":" + min + ":" + sec);
    }
}

