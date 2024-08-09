import java.util.*;
public class removing_duplicates {
    public static void main(String[] args) {
        int a[]={10,4,5,10,4,5};
        int l1=a.length;
        int b[]=new int[8];
        int k=0;
        for(int i=0;i<l1;i++)
        {
            for(int j=i+1;j<l1;j++)
            {
                if(a[i]==a[j])
                {
                   a[j]=-1;
                }
                
            }
            
        } 
        for (int i = 0; i < b.length; i++) {
            if(a[i]!=-1){
            System.out.println(a[i]);
            }
        }
    }
}
