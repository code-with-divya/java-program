/* the reverse number a mathematical method to obtain from a number another 
write in the opposite way to the first 123*/

import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int n,r;//integer value
        System.out.println("Enter any number:-");
        Scanner ref=new Scanner(System.in); //runtime java value inputing scanner class using
        n=ref.nextInt(); //scanner class predefine interger value input using.

        //logic reverse number.
        while (n>0) //the is number greater than so while loop is run. 
        {
            r=n%10;//10....one by one digit sepreated. variable r store
            System.out.println("Reverse order"+r);
            n=n/10;//10... variable store the n variable 
        }
    }
    
}
