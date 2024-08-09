import java.util.*;
public class stringequalornot {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in)
        ;
        System.out.println("Enter the first string");
        String s1=inp.nextLine();
        System.out.println("Enter the Second String");
        String s2=inp.nextLine();
        int l=s1.length();
        int l2=s2.length();
        int f=1;
        if(l!=l2)
        {
            System.out.println("Given two strings are not Equal");
            
        }
        else{
            for (int i = 0; i < l2; i++) {
                if(s1.charAt(i)==s2.charAt(i))
                {
                    f=0;
                    continue;
                    
                }
                else{
                    f=1;
                    break;
                }
            }
            if(f==0)
            {
                System.out.println("given String are equal");

            }
            else{
                System.out.println("Given are not Equal");
            }
        }
    }
}
