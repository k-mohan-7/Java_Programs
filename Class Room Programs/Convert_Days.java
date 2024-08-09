import java.util.Scanner;
public class Convert_Days {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the Days");
        int d=inp.nextInt();
        int years=d/365;
        int months=(d-(years*365))/30;
        int days=(d-years*365)-(months*30);
        System.out.println("Years "+years+"\nMonths "+months+"\nDays "+days);
    }
    
}
