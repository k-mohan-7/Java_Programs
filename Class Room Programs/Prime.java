import java.util.*;
public class Prime{
 public static void main(String[] args)
 {
    Scanner input=new Scanner(System.in);
    System.out.println("Eneter upto which you need prime numbers");
    int n=input.nextInt();
    int c;
    System.out.println("Prime number are:");
    for(int i=2;i<=n;i++)
    {
         c=0;
        for(int j=2;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c<2)
        {
            System.out.println(i);
        }
    }
    input.close();
 }
}