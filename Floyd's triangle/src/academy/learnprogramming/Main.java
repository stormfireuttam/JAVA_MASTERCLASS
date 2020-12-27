package academy.learnprogramming;

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s,w[],v="",nv="",str;
        char f,l;
        int i,count=0;
        System.out.println("Enter Your Sentence : ");
        s=in.nextLine();
        if((s.charAt(s.length()-1)=='?')||(s.charAt(s.length()-1)=='.')||(s.charAt(s.length()-1)=='!'))
        {
            w=s.split("[.?! ]+");
            for(i=0;i<w.length;i++)
            {
                f=w[i].charAt(0);
                l=w[i].charAt(w[i].length()-1);
                if(((f=='a')||(f=='e')||(f=='i')||(f=='o')||(f=='u')||(f=='A')||(f=='E')||(f=='I')||(f=='O')||(f=='U'))&&((l=='a')||(l=='e')||(l=='i')||(l=='o')||(l=='u')||(l=='A')||(l=='E')||(l=='I')||(l=='O')||(l=='U')))
                {
                    count++;
                    v=v+w[i]+" ";
                }
                else
                {
                    nv=nv+w[i]+" ";
                }
            }
            str=v.trim()+" "+nv.trim();
            str=str.trim();
            System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL : "+count);
            System.out.println("NEW STRING : \n"+str);
        }
        else
            System.out.println("INVALID INPUT");
    }
}

