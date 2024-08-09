import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int a[]=new int[10];
        int b[]=new int[10];
        System.out.println("Enter the no.of array");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+"Eleemnt");
            a[i]=inp.nextInt();
        }
        b[0]=a[n-1];
        b[n-1]=a[0];
        System.out.println("Array Before Swap");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("The Shuffeled Array is:");
        for(int i=1;i<n-1;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
