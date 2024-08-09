package bank;
import java.util.*;
public class account {
    int accno;
    String custname;
    int balance;
    String acctype;
    int charges=0;
   public  void registeraccount(int accno,String custname,String acctype)
    {
        this.accno=accno;
        this.custname=custname;
        this.acctype=acctype;
    }
    public void depositmoney(){
        Scanner inp=new Scanner(System.in);
       System.out.println("Enteer the Amount you need to Deposit");
       balance+=inp.nextInt();
    }
    public void withdrawmoney(){
       Scanner inp=new Scanner(System.in);
       System.out.println("Enter the Amount to Withdraw");
       int withdraw=inp.nextInt();
       if((balance-withdraw)<500)
       {
        System.out.println("YOu Reached minimum amount to be debited\nTo Proceed with Charges press:-\n1.Proceed with Charges\n2.Exit Transaction");
        int n=inp.nextInt();
        if(n==1)
        {
            balance-=n;
            charges+=100;
        }
       }
       else{
        System.out.println("Debited Rs:"+withdraw);
        balance-=withdraw;
       }
    }
    public void checkbalance(){
        System.out.println("AccNo:"+accno);
        System.out.println("Customer Name:"+accno);
        System.out.println("Acc Type:"+accno);
        System.out.println("Balance:"+accno);
    }
}
 