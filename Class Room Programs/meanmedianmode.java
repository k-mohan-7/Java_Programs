import java.util.*;
public class meanmedianmode {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter no.of elemments in  array");
        int n=inp.nextInt();
        int a[]=new int[10];
        for(int i=0;i<n;i++)
        {
           a[i]=inp.nextInt();
        }
        int c=0;
        for (int i = 0; i < a.length; i++) {
            c+=a[i];
        }
        if(n%2==0)
        {
            int t=n/2;
            System.out.println("Median"+(a[t]+a[t+1])/2);
        }
        else{
            System.out.println("Median"+a[n/2]);
        }
        System.out.println("Mode"+3);
    }
}
