import java.util.Scanner;
public class noo_flines {
    public static void main(String[] args) {
        Scanner  inp=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=inp.nextLine();
        int c=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                c++;
            }
        }
        System.out.println("No.of New Lines ="+c);
    }
}
