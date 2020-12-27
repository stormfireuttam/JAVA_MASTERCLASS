package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //Integer Data type
        int myIntValue = 1000;
        int myIntMinValue = Integer.MIN_VALUE, myIntMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Value = " + myIntValue);
        System.out.println("Min Integer Value = " + myIntMinValue);
        System.out.println("Max Integer Value = " + myIntMaxValue);
        System.out.println("Busted Max Integer Value = " + (myIntMaxValue + 1));
        System.out.println("Busted Min Integer Value = " + (myIntMinValue - 1));
        //Byte data type
        byte myByteMinValue = Byte.MIN_VALUE, myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Min Byte Value = " + myByteMinValue);
        System.out.println("Max Byte Value = " + myByteMaxValue);
        //Short data type
        short myShortMinValue = Short.MIN_VALUE, myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Min Short Value = " + myShortMinValue);
        System.out.println("Max Short Value = " + myShortMaxValue);
        //Long data type
        long myLongMinValue = Long.MIN_VALUE, myLongMaxValue = Long.MAX_VALUE, myLongValue = 100L;
        System.out.println("My Long Value = " + myLongValue);
        System.out.println("Min Long Value = " + myLongMinValue);
        System.out.println("Max Long Value = " + myLongMaxValue);
        //Type casting for byte and short
        byte myNewByteValue = (byte) (myByteMinValue / 2);
        short myNewShortValue = (short) (myShortMinValue / 2);
        //Challenge
        int myNewIntValue = 24729591;
        long myNewLongValue = 50000 + 10 *(myNewByteValue + myNewShortValue + myNewIntValue);
        System.out.println("The New Long Value is : " + myNewLongValue);


        //Float data type
        float myFloatMinValue = Float.MIN_VALUE, myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Min Float Value = " + myFloatMinValue);
        System.out.println("Max Float Value = " + myFloatMaxValue);

        //Double data type
        double myDoubleMinValue = Double.MIN_VALUE, myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("Min Double Value = " + myDoubleMinValue);
        System.out.println("Max Double Value = " + myDoubleMaxValue);

        //Challenge
        float myFloatValue = (float) 3.25, myFloatNewValue = 5.25f;

        //Challenge
        double pound = 200, poundsInKilograms = pound * 0.45359237;
        System.out.println("Pounds in Kilograms = " + poundsInKilograms);

        //Char type
        char myChar = 'D', myUnicodeChar = '\u00A9';
        System.out.println(myChar + " " + myUnicodeChar);

        //String type
        String myString = " \u00A9 2019";
        System.out.println(myString);

        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("Last String = " + lastString);
        double myDouble = 120.47d;
        lastString = lastString + myDouble;
        System.out.println("Last String = " + lastString);
    }
}
