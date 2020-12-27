package academy.learnprogramming;

public class Main {

    public static void main(String[] args)
    {
        System.out.println(calcFeetAndInchesToCentimeters(45));
        System.out.println(calcFeetAndInchesToCentimeters(13, 1));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if (feet >= 0 && inches >= 0 && inches <= 12)
        {
            inches += feet * 12;
            return (inches * 2.54);
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
        if (inches >= 0)
        {
            int feet = (int) inches / 12;
            double newFeet = feet;
            inches -= feet * 12 ;
            double centimeter = calcFeetAndInchesToCentimeters(newFeet, inches);
            return centimeter;
        }
        return -1;
    }
}
