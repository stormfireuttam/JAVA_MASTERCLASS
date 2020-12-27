package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input : ");
        int n = sc.nextInt();
        int rows = 3 * n - 2, column = n + n / 2, factor = 0, i, j, k, factor2 = 1, factor3 = (n / 2) + 1;
       // System.out.println(factor3);

        for (i = 0; i < rows; i ++){

            if (n == 3 && i == n){
                for (j = 0; j < n; j ++){
                    System.out.print("X");
                }
                for (j = 0; j < n - 1; j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            else if (i < n - 1 || i > (2 *n)){
                for (j = 0; j < column - 1; j ++){
                    System.out.print(" ");
                }
                System.out.println("X");
            }

            else if (i == n - 1 || i == (2 * n - 2)){
                for (j = 0; j < (n / 3) + 1; j ++){
                    System.out.print(" ");
                }
                for (j = 0; j < n; j ++) {
                    System.out.print("X");
                }
                System.out.println();
            }

            else if (i >= n && i < (n + n / 3)) {
                for (j = 0; j < n / 3; j++) {
                    System.out.print(" ");
                }
                for (j = 0; j < (n / 3 + factor); j++) {
                    System.out.print("X");
                }
                for (j = 0; j < n - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println();
                factor ++;
            }

             else if (i == (n + n / 3)){
                    for (j = 0; j < factor3; j ++){
                        System.out.print("X");
                    }
                    for (j = 0; j < n - 1; j ++){
                        System.out.print(" ");
                    }
                System.out.println();
                }

             else {
                 for (j = 0; j < factor2; j ++) {
                     System.out.print(" ");
                 }
                 for (j = 0; j < n / 3; j ++){
                     System.out.print("X");
                 }
                 for (j = 0; j < n - 1; j ++){
                     System.out.println(" ");
                 }
                 factor2 ++;
            }
        }


    }
}
