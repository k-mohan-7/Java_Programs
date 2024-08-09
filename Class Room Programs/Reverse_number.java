import java.util.*;
public class Reverse_number{
    public static void main(String[] ars){
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        while(n!=0)
        {
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}