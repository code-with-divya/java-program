//package ATMmachine;

import java.util.Scanner;

class ATM{
    float balance;
    int PIN=1207;

    public void checkpin(){
        System.out.println("Enter your pin:-");//user mssg
        Scanner sc=new Scanner(System.in);//input
        int enterpin=sc.nextInt();//create variable user entering the pin
        if(enterpin==PIN){//pin valid and invalid checking condition...
            menu();//calling function

        }
        else{
            System.out.println("Enter a valid pin");//user mesge sending
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1.check  A/C balance");
        System.out.println("2. withdraw money");
        System.out.println("3.deposite money ");
        System.out.println("exist");
        Scanner sc=new Scanner(System.in);//input
        int opt=sc.nextInt();
        if(opt==1){//checking condition check balance
            checkbalance();//calling
        }
        else if(opt==2){// second condtion checking withdrawmoney
            withdraw();//calling
        }
        else if(opt==3){//third condtion checking depositemoney
            depositemoney();//calling
        }
        else if(opt==4){
            return;
        }
        else{
            System.out.println("Enter the valid choice");
        }

    }
    public void checkbalance(){//function
        System.out.println("Balnce:"+balance);
        menu();//calling
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw:");
        Scanner sc=new Scanner(System.in);//input
        float amount=sc.nextFloat();
        if(amount>balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Money withdraw sucessfully");
        }
        menu();

    }
    public void depositemoney(){
        System.out.println("enter the deposite moneny");
        Scanner sc=new Scanner(System.in);//input
        float amount=sc.nextFloat();
        balance = balance+amount;
        System.out.println("money deposite is sucessfully");

    } 

    }

public class ATMmachine{
    public static void main(String  args[]) {
        ATM obj=new ATM();
        obj.checkpin();
        
    }

    
}
