import java.util.*;
public class bpractice{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
    System.out.println("Enter the number");
   int n=inp.nextInt();
   int a[]=new int[n];
   for (int i=0;i<n;i++) {
    Scanner inp1=new Scanner(System.in);
     a[i]=inp1.nextInt();
   }
   System.out.println("duplicates are");
   for(int j=0;j<n;j++)
   {
    int c=1;
    for (int i = j+1; i < n; i++) {
        if(a[j]==a[i])
        {
           a[i]=-1;
           c++;
        }
    }
    
        if(a[j]!=-1){
        System.out.println(a[j]+" count="+c);
        }
    
   }
}

}