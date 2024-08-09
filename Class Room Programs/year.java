import java.util.*;
public class year {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Year");
        int n=inp.nextInt();
        if((n%4==0)||(n%400==0)&&(n%100!=0))
        {
            System.out.println("Year you Entered "+n+"is Leap year");
        }
        else{
            System.out.println("Year You Entered is not a Leap Year");
        }

    }
}
