import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
     System.out.println("Enterthe Table you need ");
     int n=input.nextInt();
     Scanner input1=new Scanner(System.in);
     System.out.println("Enter the Numbeer Upto which you need");
     int m=input1.nextInt();
        for(int i=1;i<=m;i++)
    {
        System.out.println(n+"*"+i+"="+n*i);
    }
    }
}
