/*Even number are those number which are divisiable by 2
 and odd number which are not divisiable by 2.*/

import java.util.Scanner;
public class OddEvenNumber
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);//runtime java value inputing scanner class using
        n=ref.nextInt(); //scanner class predefine interger value input using.

        //logic in codition.
        if(n%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");

        }
    }
    
}
