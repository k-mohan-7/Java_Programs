import java.util.*;
public class sumofeventermsinfib {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no.of fibannnoci terms needed");
        int n=inp.nextInt();
        int a=0,b=1,c=0;
        int s=1,d=0;
        System.out.println("Even terms are :");
        for(int i=0;i<n;i++)
        {
           c=a+b;
           if(s%2==0)
           {
            System.out.println(a);
            d+=a;
           }
           a=b;
           b=c;
           s++;
        }
        System.out.println("Sum of even terms is " +d);
    }
}
