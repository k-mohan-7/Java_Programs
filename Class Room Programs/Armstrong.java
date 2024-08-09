import java.util.*;
public class Armstrong{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter the number to check Armstrong are not");
       int n=input.nextInt();
       int m=n;
       int s=0;
       while(n!=0)
       {
        int r=n%10;
        s+=Math.pow(r,3);
        n/=10;
       }
       if(s==m)
       {
        System.out.println("Armstrong Number");
       }
       else{
        System.out.println("NOT Armstrong Number");
       }
       input.close();
    }
}