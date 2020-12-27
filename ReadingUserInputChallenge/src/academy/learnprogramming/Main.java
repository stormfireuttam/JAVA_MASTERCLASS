package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, counter = 0, order;

        while (true)
        {
            order = counter + 1;
            System.out.println("Enter number " + order + ": " );
            boolean isInt = sc.hasNextInt();
            if (isInt)
            {
                counter ++;
                sum += sc.nextInt();

                if (counter == 10)
                    break;
            }
            else
            {
                System.out.println("Invalid Number");
            }
            sc.nextLine();
        }
        System.out.println("Sum of numbers = " + sum);

    }
}
