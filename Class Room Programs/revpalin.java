import java.util.*;
public class revpalin {
    public static int rev(int n)
{int r=0;
    while(n!=0)
    {
        int t=n%10;
        r=r*10+t;
        n=n/10;
    }
    return r;
}
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=inp.nextInt();
        
            while(n!=0)
            {
                int m=n;
                int r=rev(m);
                
                int t=m+r;
                System.out.println(m+"+"+r+"="+t);
                int k=t;
                if(k==rev(k))
                {
                    System.out.println("Number "+k+"is Palindrome");

                    break;
                }
                else{
                  n=k;
                }
            }
                
        
    }
}
