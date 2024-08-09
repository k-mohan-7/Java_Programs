import java.util.*;
public class mergesortarray{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no.of elements for 1st array");
        int l1=inp.nextInt();
        System.out.println("Enter the no.of elements for 2nd array");
        int l2=inp.nextInt();
        int k=0,i=0,j=0;
        int a[]=new int[l1];
        int b[]=new int[l2];
        int c[]=new int[l1+l2];
        System.out.println("Enter a array elements");
        for (int l = 0; l < l1; l++) {
            System.out.println("enter teh element of"+l);
            a[l]=inp.nextInt();
        }
        System.out.println("Enter b array elements");
        for (int l = 0; l < l1; l++) {
            System.out.println("enter teh element of"+l);
            b[l]=inp.nextInt();
        }
        while(k<(l1+l2))
        {
           if(a[i]<b[j])
           {
            c[k]=a[i];
                     System.out.println(" in if  i ="+i+"j="+j+" k="+k+"c[k]="+c[k]);

            k++;
            if(i==l1-1)
            {
                continue;
            }
            else{
            i++;
            }
           }
           else{
            c[k]=b[j];
           
            System.out.println(" in else  i ="+i+"j="+j+" k="+k+"c[k]="+c[k]);
             k++;
            if(j==l2-1)
            {
                continue;
            }
            else{
            j++;
            }
           }
        }
        
    }
}