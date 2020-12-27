package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean found = true;   int i = 0, j = 0,n, m, sum = 0, diff = 0;
        while(found){
            i++;
            n = Pentagonal(i);
            for (j= i -1; j > 0;j --) {
                m = Pentagonal(j);
                if(isPentagonal(m + n) && isPentagonal(m - n))
                {
                    System.out.println(m + " " + n);
                    found = false; break;   }
            }

        }
    }
    public static int Pentagonal(int x) {
        return x * (3 * x - 1) / 2;
    }
    public static boolean isPentagonal(int x) {
        double pentagonal = (Math.sqrt(1 + 24 * x) + 1.0)/6.0;
         return pentagonal == ((int)pentagonal);
    }
}