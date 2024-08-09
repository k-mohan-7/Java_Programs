import java.util.*;
public class string_rev_alphabatic_option {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter no.of Strings you need");
        int n=inp.nextInt();
         String s[]=new String[10];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+i+"String");
            s[i]=inp.nextLine();
        }
        System.out.println("Enter the 1.for Alphabatic \n2.For Reverse Alphabatic order");
        int o=inp.nextInt();
        for (int i=0;i<n;i++) {
            for (int j = i+1; j < n; j++) {
                if(o==1)
                {
                    if(s[i].charAt(0)>s[j].charAt(0))
                    {
                        String t=s[i];
                        s[i]=s[j];
                        s[j]=t;
                    }
                }
                else if(o==2)
                {
                    if(s[i].charAt(0)>s[j].charAt(0))
                    {
                        String t=s[i];
                        s[i]=s[j];
                        s[j]=t;
                    }
                }
            }
            
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
