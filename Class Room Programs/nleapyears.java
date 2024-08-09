import java.util.*;
public class nleapyears {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the starting year");
        int n=inp.nextInt();
        System.out.println("Enter the no.of leap years needed");
        int t=inp.nextInt();
        int s=0;
        while(s<t)
        {
            if(n%4==0||n%400==0&&n%100!=0)
            {
                System.out.println(n);
                s++;
            }
            n++;

        }
    }
}
