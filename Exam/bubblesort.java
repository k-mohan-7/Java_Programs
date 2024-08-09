import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        int a[]=new int[10];
        
        System.out.println("Enter the no.of array");
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+"Eleemnt");
            a[i]=inp.nextInt();
        }
        System.out.println("The Terms are");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                  int t=a[i];
            a[i]=a[j];
            a[j]=t;
                }
            }
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
