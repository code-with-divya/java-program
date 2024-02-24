/*a paliendrome number that remain the same when its 
digites are reversed 121 so reverse 121 */
import java.util.Scanner;
public class PaliendromeNumber
{
    public static void main(String[] args) 
    {
        int n,s=0,c,r;//integer value
        System.out.println("Enter any number");
        Scanner ref=new Scanner(System.in);//runtime java value inputing scanner class using
        n=ref.nextInt(); //scanner class predefine interger value input using.

        //logic palindrome number.
        c=n;//compare and equal
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;//s variable addition using
            n=n/10;
        }
        if(c==s)//armstrong number checking condition.
            System.out.println("paliendromw number");
        else
            System.out.println("not paliendrome number");
    }
}