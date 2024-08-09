import java.util.Scanner;
public class Dec_Binary {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int n=inp.nextInt();
        String s="";
        while(n!=0)
        {
            int r=n%2;
            s=r+s;
            n=n/2;
        }
        System.out.println("Binary Number is:"+s);
    }
}
