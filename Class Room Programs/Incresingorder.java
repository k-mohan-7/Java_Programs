import java.util.Scanner;
public class Incresingorder {
    public static void main(String[] args)
    {
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the no.of elemets required"); 
        int n=inp1.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+i+"Element");
            Scanner inp=new Scanner(System.in);
            a[i]=inp.nextInt();
        }
        System.out.println("Elements Before Sorting");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("elements After Sorting");
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
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
