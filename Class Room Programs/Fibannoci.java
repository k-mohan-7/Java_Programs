import java.util.Scanner;
public class Fibannoci {
    public static void main(String[] args)
    {    int a=0,b=1,c=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter How Many Fibanocci Series YOU Need");
        int n=input.nextInt();
        System.out.println("fibannoci Series is:");
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;
        }
    }
}
