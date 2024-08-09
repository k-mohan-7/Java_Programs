import java.util.*;
public class Reverse_String {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the string");
        String sb=inp.nextLine();
        StringBuilder s=new StringBuilder(sb);
                for(int i=0;i<s.length()/2;i++)
        {
            int f=i;
            int l=s.length()-i-1;
            char fc=s.charAt(f);
            char lc=s.charAt(l);
            s.setCharAt(f, lc);
            s.setCharAt(l,fc);
        }
        System.out.println(s);
    }
}
