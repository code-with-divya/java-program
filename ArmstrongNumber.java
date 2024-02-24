/*a armstrong number a that equal the sum of its digites each raised to power
  1^3+5^3+3^3 equal.153---(1*1*1+5*5*5+3*3*3)=153*/

import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        int n,arm=0,rem,c;//integer value
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);//runtime java value inputing scanner class using
        n=ref.nextInt(); //scanner class predefine interger value input using.

        
        //logic armstrong number.
        c=n;
        while (n>0)//n value 0 while loop excuted.
        {
            rem=n%10;
            arm=(rem*rem*rem)+arm;//rem armstrong number.
            n=n/10;//end logic
            
        }
        if(c==arm)
                System.out.println("armstrong number");
            else
                System.out.println("not armstrong number");

        }
    
}
