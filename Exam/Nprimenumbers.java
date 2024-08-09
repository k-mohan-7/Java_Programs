import java.util.*;
public class Nprimenumbers {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=inp.nextInt();
        int i=2,k=0;
        System.out.println("Prime Numbers are");
        while(k<n)
        {
            int c=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }

            }
            if(c<2)
            {
                System.out.println(i);
                k++;
            }    
            i++;
        }
    }
}
