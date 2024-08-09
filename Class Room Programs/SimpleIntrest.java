import java.util.*;
public class SimpleIntrest {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p=inp.nextInt();
        System.out.println("enter time");
        double t=inp.nextInt();
        System.out.println("Enter 1.Senior Citizen\n2.Others");
        int c=inp.nextInt();
        double intrest=0;
        if(c==1)
        {
           intrest=(p*t*0.2)/100;
        }
        else if(c==2)
        {
            intrest=(p*t*0.1)/100;
        }
        System.out.println("the simple intrest is"+intrest);
    }
}
