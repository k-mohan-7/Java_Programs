import java.util.*;
public class Reversing_set_of_names {
    public static void main(String[] args)
    {
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the no.of Strings required"); 
        int n=inp1.nextInt();
        
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+"Element");
            Scanner inp=new Scanner(System.in);
            a[i]=inp.nextLine();
        }
        Scanner inp3=new Scanner(System.in);
        System.out.println("Enter 1 for asending 2 for desending");
        int o=inp3.nextInt();
        if(o==1){
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].charAt(0)<a[j].charAt(0))
                {
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    else{
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].charAt(0)<a[j].charAt(0))
                {
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
}
}
