import bank.*;
import java.util.*;
public class bankapp {
    static void login( checkingaccount c,savings s)
    {Scanner inp=new Scanner(System.in);int n;
       do{ System.out.println("Enter \n1.To check Savings account\n2.Check account Status\n3.EXIT");
      n=inp.nextInt();
      switch (n) {
        case 1:
            
            s.instrestforamount();
            break;      
        case 2:
        c.check();
            break;
      }
    }
    while(n!=3);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        account a=new account();
        savings s=new savings();
        checkingaccount c=new checkingaccount();
        int n;
        
        do{
        System.out.println("Enter \n1.Create account\n2.Deposit Money\n3.Withdraw MOney \n4.Check Balance\n5.Login to account\n6.Exit");
        n=inp.nextInt();
        
        switch(n)
        {
            case 1:
            System.out.println("Enter the accno");
            int ac=inp.nextInt();
            System.out.println("Enter Your name");
            String st=inp.nextLine();
            System.out.println("Enter account type you prefer");
            String acty=inp.nextLine();
            a.registeraccount(ac,st,acty);
            break;
            case 2:
            a.depositmoney();
            break;
            case 3:
            a.withdrawmoney();
            break;
            case 4:
            a.checkbalance();
            break;
            case 5:
            login(c,s);
            break;

        }
    }
    while(n!=6);
    
    }
}
