import java.util.Scanner;
public class Nth_Mth_largest_Smallest {
    public static void main(String[] args)
    {
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the no.of elemets required"); 
        int n=inp1.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+1+"Element");
            Scanner inp=new Scanner(System.in);
            a[i]=inp.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Enter the Mth postiton for Largest Number");
        Scanner inp3=new Scanner(System.in);
        int m=inp3.nextInt();
        System.out.println("Enter the Nth Postion to find out the Smallest Number");
        Scanner inp4=new Scanner(System.in);
        int u=inp4.nextInt();
        System.out.println("Nth Smallest Number is: "+a[u-1]);
        System.out.println("Mth Maximum Number is: "+a[n-m]);
    }
}
