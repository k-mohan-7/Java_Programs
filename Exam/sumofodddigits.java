import java.util.*;
public class sumofodddigits {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=inp.nextInt();
        int s=0,c=0;
        while(n!=0)
        {
           int r=n%10;
           if(s!=0)
           {
             c+=r;
           }
           s++;
           n=n/10;
        }
        System.out.println("the sum is "+c);
    }
}
