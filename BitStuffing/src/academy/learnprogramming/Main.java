package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n, i = 0, j, counter = 0;
        String frame, newFrame;
        System.out.println("Enter the size of the frame = ");
        n = sc.nextInt();
        System.out.println("Enter frame in form of 0 and 1 = ");
        frame = sc.nextLine();
        for (i = 0; i < n; i ++) {
            char ch = frame.charAt(i);
            if (ch == '1') {
                for(j = i + 1; j < n; j ++) {

                }
            }
        }
    }
}
