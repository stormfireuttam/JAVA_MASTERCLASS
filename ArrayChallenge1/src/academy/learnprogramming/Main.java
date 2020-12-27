package academy.learnprogramming;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        System.out.println("Enter the size of Array = ");
        int size = sc.nextInt();
        int[] array = new int[size];
        array = getIntegers(size);
        array = sortIntegers(array);
        printArray(array);

    }

    public  static int[] getIntegers(int size)
    {
        int values[] = new int[size];
        System.out.println("Enter " + size + " integer values : \n");
        for (int i = 0; i < size; i ++){
            values[i] = sc.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i ++ ){
            System.out.println("The content of array at " + (i+1) +" position is : " + array[i]);
        }
    }

    public static int[] sortIntegers(int []array) {
        int temp;
        for (int i = 0; i < array.length; i ++)
        {
            for (int j = i + 1; j < array.length; j ++)
            {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
