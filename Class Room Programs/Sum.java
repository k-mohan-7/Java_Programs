import java.util.Scanner;
public class Sum {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       int c=0;
       for(int i=1;i<=n;i++)
       {
        c+=i;
       }
       System.out.println("The Sum of Numbers is "+c);
    }
}
