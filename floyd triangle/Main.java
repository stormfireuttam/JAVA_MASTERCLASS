import java.util.*;

class Main
{
    public static void main(String args[])
    {
        int i, j, rows;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        System.out.println("Floyd’s Triangle");
        int k = 1;
        for(i=1; i<=rows; ++i)
        {
            for(j=1; j<=i; ++j)
            {
                System.out.print(k + " ");
                k = k + 1;
            }
            System.out.print("\n");
        }
    }
}