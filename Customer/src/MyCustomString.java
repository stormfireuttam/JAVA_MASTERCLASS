
/** * * @author Your name * */
public class MyCustomString
{
    private String myCustomString;
    public String getString()
    {
        return myCustomString;
    }
    public void setString(String string)
    {
        this.myCustomString=string;
    }
    public int countNumbers()
     {
         int numCount=0;
         char[] charArray;
         if(myCustomString == null) {
             return 0;
         }
         charArray=myCustomString.toCharArray();
         if(charArray.equals("")) {
            return 0;
         }
         for (int i=0;i<charArray.length;i++)
         {
             char c = charArray[i];
             if (Character.isDigit(c))
             { numCount++;
                for( int j=i+1; j<charArray.length; j++)
                {
                    char ch = charArray[j];
                    if(!Character.isDigit(ch)){
                        i = j-1;
                        break;
                    }
                    if(Character.isDigit(ch) && (j == (charArray.length-1))){
                        return numCount;
                    }
                }
             }
         }
         return numCount;
     }
     public String increaseDigits(int n)
    {
        char[] charArray;
        int sum, number;
        charArray=myCustomString.toCharArray();
        for (int i=0;i<charArray.length;i++) {
            char c = charArray[i];
            if (Character.isDigit(c)) {
                number = Character.getNumericValue(c);
                sum = number + n;
                if (sum > 9) {
                    sum = sum % 10;
                }
                charArray[i] = Integer.toString(sum).charAt(0);
            }
        }
        return String.valueOf(charArray);
    }
}
