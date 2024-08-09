import java.util.Scanner;
public class Search {
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
        System.out.println("Elements you enterd ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("Enter the element you need to SEarch");
        Scanner inp2=new Scanner(System.in);
        int k=inp2.nextInt();
        for(int i=0;i<n;i++)
        {
            if(k==a[i])
            {
                System.out.println("Element you are searching found at position "+(i+1));
            }
        }
    }
}
