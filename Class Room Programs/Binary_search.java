import java.util.*;
public class Binary_search {
    public static int binary(int a[],int l,int h,int k)
    {
        int m=(l+h)/2;
        if(l>h)
        {
            return -1;
        }
        if(a[m]==k)
        {
            return m;
        }
        if(a[m]>k)
        {
            return binary(a,0,m-1,k);
        }
        if(a[m]<k)
        {
            return binary(a,m+1,h,k);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the no.of elemets required"); 
        int n=inp1.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"Element");
            Scanner inp=new Scanner(System.in);
            a[i]=inp.nextInt();
        }
        System.out.println("Enter the key element to search");
        Scanner inp2=new Scanner(System.in);
        int k=inp2.nextInt();
        System.out.println("elemetnt found at position "+(binary(a,0,n,k)+1));
    }
}
