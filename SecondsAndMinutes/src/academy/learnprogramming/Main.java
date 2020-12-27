package academy.learnprogramming;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(getDurationString(100,20));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-56));
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes >= 0 && seconds >= 0 && seconds < 60)
        {
            int hours , minutesRemaining, secondsRemaining;
            seconds += minutes * 60;
            hours = seconds / 3600;
            minutesRemaining = (seconds % 3600) / 60;
            secondsRemaining = (seconds % 3600) % 60;
            String hoursInString = hours + "h ", minutesInString = minutesRemaining + "m ", secondsInString = secondsRemaining + "s ";

            if (hours < 10 || minutesRemaining < 10 || secondsRemaining < 10)
            {
                if (hours < 10)
                {
                    hoursInString = "0" + hours + "h ";
                }
                if (minutesRemaining < 10)
                {
                    minutesInString = "0" + minutesRemaining + "m ";
                }
                if (secondsRemaining < 10)
                {
                    secondsInString = "0" + secondsRemaining + "s ";
                }
            }
            return (hoursInString + minutesInString + secondsInString);
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds)
    {
        if (seconds > 0)
        {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid value";
    }

}
