package bank;
import java.util.Scanner;
public class checkingaccount extends account{
    
    public void check(){
        System.out.println("Checking for Account info");
    if(balance<10000)

    {   Scanner inp=new Scanner(System.in);
        System.out.println("you had reached minimum amount \n1.refill\n2.continue with charges");
        int n=inp.nextInt();
        if(n==1)
        {
            depositmoney();
        }
        if(n==2)
        {
            charges+=100;
        }
    }   
    else{
        System.out.println("YOUR ARE MAINTAINING YOUR ACCOUNT Great");
    }
}
}
