import java.util.Scanner;
public class Biggest{
    public static void main(String[] args){
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter the a input");
        int a=input1.nextInt();
        Scanner input2=new Scanner(System.in);
        int b=input2.nextInt();
        Scanner input3=new Scanner(System.in);
        int c=input3.nextInt();
        int max=a;
        if(b>max)
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println("The Higest number is "+max);
    }
}