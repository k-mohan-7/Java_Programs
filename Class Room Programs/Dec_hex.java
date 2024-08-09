import java.util.Scanner;
public class Dec_hex {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Decimal number to conver Hexa Decimal");
        int n=inp.nextInt();
       String s=Integer.toHexString(n);
        System.out.println("Hexa Decimal Value is:"+s);
    }
}
