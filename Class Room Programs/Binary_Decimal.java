import java.util.*;
public class Binary_Decimal{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int i=0;
        double t=0;
        while(n!=0)
        {
           int r=n%10;
            t=t+(r*(Math.pow(2,i)));
           n/=10;
           i++;
        }
        System.out.println("Decimal="+t);
    }
}