import java.util.*;
public class uniqueletters {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the string with duplicates");
        String s=inp.nextLine();
        int l=s.length();
        char a[]=s.toCharArray();
        for (int i=0;i<l;i++) {
            for(int j=i+1;j<l;j++)
            {
                if(a[i]==a[j])
                {
                    a[i]='$';
                    a[j]='$';
                }
            }
            if(a[i]!='$')
            {
                System.out.println(a[i]);
            }
        }
    }
}
