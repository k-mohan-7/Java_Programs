import java.util.*;
public class mergestring {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s=inp.nextLine();
        System.out.println("Enter the second string");
        String s1=inp.nextLine();
        int l1=s.length();
        int l2=s1.length();
        s+=" ";
        for(int i=0;i<l2;i++)
        {
            s+=s1.charAt(i);
        }
        System.out.println(s);
    }
}
