package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(5);
        printDayOfTheWeek(3);
        printDayOfTheWeek(9);
        sum3And5Challenge();
        System.out.println(sumDigits(3));
        System.out.println(sumDigits(125));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(123321));
        System.out.println(sumFirstAndLastDigit(1234));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static void printDayOfTheWeek(int day)
    {
        switch(day)
        {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Date");
        }
    }
    public static void sum3And5Challenge()
    {
        int f = 0, sum = 0;
        for (int i = 1; i <= 1000; i ++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i);
                f ++;
                sum = sum + i;
            }
            if (f == 5)
            {
                System.out.println("Sum of numbers = " + sum);
                break;
            }

        }
    }
    public static int sumDigits(int number)
    {
        int sum = 0;
        if (number >= 10)
        {   int n = 0;
            while(number > 0)
            {
                n = number % 10;
                sum += n;
                number = number / 10;
            }
            return sum;
        }
        return -1;
    }
    public static boolean isPalindrome(int number)
    {
        if (number < 1)
            number *= -1;
        int reverse = 0, lastDigit, n = number;
        while (number > 0)
        {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if (n == reverse)
            return true;
        return false;
    }
    public static int sumFirstAndLastDigit(int number)
    {
        int first = 0, last = 0, sum = 0;
        if (number >= 0)
        {
            last = number % 10;
            do
            {
                number /= 10;
            }while(number >= 10);
            first = number % 10;
            sum = first + last;
            return sum;
        }
        return -1;
    }
}