import java.util.*;
public class Lcm_Gcd {
    public static void main(String[] args)
    {
        int h,i=1,gcd=0,lcm=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Ener the first digit of Lcm n");
        int n=inp.nextInt();
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the second digit M");
        int m=inp1.nextInt();
        if(n>m)
        {
            h=m;
        }
        else{
            h=n;
        }
        while(i<=h)
        {
            if(n%i==0&&m%i==0)
            {
                gcd=i;
            }
            i++;
        }
        System.out.println("Gcd of "+n+"and "+m+"is "+gcd);
        System.out.println(lcm=(n*m)/gcd);

    }
}
