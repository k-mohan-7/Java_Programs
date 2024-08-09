import java.util.*;
public class menufor_incr_decr_linersearch{
    public static void incressin_order(int a[],int l)
    {
      System.out.println(a[0]); 
    }
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter \n1.IncressingOrder\n2.DecressingOrder\n3.Linear Search\n4.binary Search");
        int n=inp.nextInt();
        System.out.println("Enter No.of to be in array");
        
        int l=inp.nextInt();
        int a[]=new int[l];
        for (int i = 0; i < args.length; i++) {
            System.out.println("Enter the "+i+"Element");
            a[i]=inp.nextInt();
        }
       if(n==1)
       {
        incressin_order(a,l);
       }
    }
}