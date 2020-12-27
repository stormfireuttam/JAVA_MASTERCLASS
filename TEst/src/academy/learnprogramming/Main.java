package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   // to store number of test cases
        if(t>=1 && t<=100){
            int a[] = new int[t];
            int count = 0;
            ArrayList<String> output = new ArrayList<>(t);
            for(int i = 0; i < t; i ++) {
                a[i] = sc.nextInt();
                if(a[i] >= 3 && a[i] <= 105) {
                    byte arr[] = new byte[a[i]];
                    for(int j = 0; j < a[i]; j ++) {
                        arr[j] = sc.nextByte();
                    }
                    for(int k = 1; k < a[i]; k ++) {
                        if(arr[k-1] > arr[k]){
                            count ++;
                        }
                    }
                    if (count <= 1)
                    {
                        output.add("TRUE");
                    }
                    else {
                        output.add("FALSE");
                    }
                    count = 0;
                }
            }
            for (int i = 0; i < t; i ++) {
                System.out.println(output.get(i));
            }
        }
    }
}