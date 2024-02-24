/*prime number that is greater 1 and divide by 1 or itself only.in other word
prime numbers cant't be divide by other number that itself or 1.2,3,5,7,11,13,17
are the prime number*/

import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[]args)
    {
        int n,count=0;//integer type variable
        System.out.println("Enter any number:-");
        Scanner r=new Scanner(System.in);//runtime java value inputing scanner class using
        n=r.nextInt();//scanner class predefine interger value input using.

        //logic prime number.
        for(int i=1;i<n;i++)
        {
            if(n%i==0)/*i divisible reminder 0*/
            {
                count++;// count variable checking the prime number or not prime number
            }
            if(count==2)
            System.out.println("prime number");
        else
            System.out.println("not prime number");
        }
    }
}

