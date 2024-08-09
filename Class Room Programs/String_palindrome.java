import java.util.*;
public class String_palindrome {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        int l=s.length();
        int f=1;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==s.charAt(l-(i+1)))
            {
               f=1;
            }
            else{
                f=0;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("Given  is Pallindrome");
        }
        else{
            System.out.println("Given is Not Palindrome");
        }
    }
}
