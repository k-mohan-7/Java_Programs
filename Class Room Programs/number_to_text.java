import java.util.*;
public class number_to_text {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number to convert");
        int n=inp.nextInt();
        String s[]={"zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String re="";
        while(n!=0)
        {
            int r=n%10;
            re=s[r]+" "+re;
            n=n/10;

            
        }
        System.out.println(re);
    }   
}
