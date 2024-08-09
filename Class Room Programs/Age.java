import java.util.Scanner;
public class Age{
    public static void main(String[] args)
    {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=input.nextInt();
      for(int i=0;i<n;i++)
    {
       for(int j=0;j<=i;j++)
       {
        System.out.print("*");
       }
       System.out.println();
       for(int j=0;j<n-i;j++)
       {
        System.out.print("*");
       }
    }
    input.close();
    }
}