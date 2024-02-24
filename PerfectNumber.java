/*perfect number is positive integer that is equal to the sum of its positive divisior 
 excluding the number itself 1+2+3=6 so 6 is perfect number*/

import java.util.Scanner;
public class PerfectNumber
{
    public static void main(String[] args) 
    {
       int n,sum=0;//integer value,sum addition this using
       System.out.println("Enter the number:-");
       Scanner r=new Scanner(System.in);//runtime java value inputing scanner class using 
       n=r.nextInt();//scanner class predefine interger value input using.
       
       //logic perfect number.
       for(int i=1;i<n;i++)
       {
            if(n%i==0)/*i divisible reminder 0*/
            {
                sum=sum+i;//sum is the checking perfect no or not perfect no
            }

       }
       if(n==sum)
            System.out.println("perfect number");
        else
            System.out.println("not perfect number");


    }
    
}
