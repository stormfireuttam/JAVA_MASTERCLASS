package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*-Write a method called reverse() with an int array as a parameter.
The method should not return any value. In other words, the method is allowed to modify the array parameter.
-In main() test the reverse() method and print the array both reversed and non-reversed.
-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number of elements to be stored in array : ");
        int n = sc.nextInt();
        int []array = getArray(n);
        System.out.println("Original Array : " + Arrays.toString(array));
        array = reverse(array);
        System.out.println("Reversed Array : " + Arrays.toString(array));
    }

    public static int[] getArray(int count){
        int []array = new int[count];
        for (int i = 0; i < count; i ++) {
            System.out.println("Enter value to be stored in array : ");
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] reverse(int[] array) {
        int reversedArray[] = new int[array.length];
        int index = 0;
        for (int i = array.length - 1; i >= 0 ; i --) {
            reversedArray[index ++] = array[i];
        }
        return reversedArray;
    }
}
