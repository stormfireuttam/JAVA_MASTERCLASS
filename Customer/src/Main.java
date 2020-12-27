public class Main {
    public static void main(String[] args) {
        MyCustomString str= new MyCustomString();
        str.setString("hello 90 it is 2 and you are an 11 quite strange but not 7");
        System.out.println("Input String : " + str.getString());
        System.out.println("Count of Numbers in given String: " + str.countNumbers());
        System.out.println("After incrementing numbers in String: " + str.increaseDigits(2));
        str.setString("368269325692389923");
        System.out.println("Input String : " + str.getString());
        System.out.println("Count of Numbers in given String: " + str.countNumbers());
        str.setString(null);
        System.out.println("Input String : " + str.getString());
        System.out.println("Count of Numbers in given String: " + str.countNumbers());


    }
}
