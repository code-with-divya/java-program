//Daimond Pattern in java program.
import java.util.Scanner;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;//n1 value 
        int n2=n;//n2 value

        //first hlaf row print.
        int i=1;//i is current row this.
        while (i<=n1){//n timee loop go.
            int space=1; //space printed 1.
            while(space<=(n1-i)){
                System.out.print(" ");
                space=space+1;//increment.
            
        }
        int j=1;
        while (j<=(2*i-1)){
            System.out.print("*");
            j=j+1;            
        }
        System.out.println(" ");
        i=i+1;//n1 time print this.
        }

        //second hlaf
        i=n2;
        while (i>=1){
            int space=1;
            while (space<=(n2-i+1)){
                System.out.print(" ");
                space=space+1;
            
            }
            int j=1;
            while (j<=(2*i-1)){
                System.out.print("*");
                j=j+1;
            
            }
            System.out.println("");
            i=i-1;

        }
    }
    
}
