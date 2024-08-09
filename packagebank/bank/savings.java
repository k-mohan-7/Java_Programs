package bank;
import java.util.*;
public class savings extends account{
    double interest;
    public void instrestforamount()
    {System.out.println("Your Savings account status\nChecking Bank details for interest payment");
        if(balance<10000)
        {
            System.out.println("YOu are not Eligible for Getting interest maintain amount greater than 10000");
System.out.println("your balance is"+balance);
        }
        else{
            System.out.println("Cheking for Interest amount paid for you");
            Scanner inp=new Scanner(System.in);
            System.out.println("Enter the NO.of years from  creating the account");
            int y=inp.nextInt();
            System.out.println("Based on the compound Intrest with rate 5%");
            interest=(balance*(1+(0.5))*y);
            System.out.println("your Interest Amount is:"+interest);
            System.out.println("YOUR Present Bank Balance is:");
            balance+=interest;
            checkbalance();
        }
    }    
}

