package academy.learnprogramming;


import java.util.Scanner;

class DateTime {
    Scanner sc = new Scanner(System.in);
    int year, month, day, hour, minute;

    DateTime() {
        this.year = 0;
        this.month = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
    }
    DateTime(int y, int m, int d, int h, int min) {
        this.year = y;
        this.month = m;
        this.day = d;
        this.hour = h;
        this.minute = min;
    }

    String toFormattedString() {
        String formattedDate = String.format("%02d", this.day) + "/" + String.format("%02d", this.month) + "/" + this.year;
        String formattedTime = String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute);
        return formattedDate + " " + formattedTime;
    }

    DateTime getTime() {
        System.out.print("Year: ");
        year = sc.nextInt();
        System.out.print("\nMonth: ");
        month = sc.nextInt();
        System.out.print("\nDay: ");
        day = sc.nextInt();
        System.out.print("\nHour: ");
        hour = sc.nextInt();
        System.out.print("\nMinute: ");
        minute = sc.nextInt();
        DateTime t = new DateTime(year, month, day, hour, minute);
        return t;
    }
}