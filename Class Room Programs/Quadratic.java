import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the a value");
        int a=inp.nextInt();
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the b value");
        int b=inp1.nextInt();
        Scanner inp2=new Scanner(System.in);
        System.out.println("Enter the c value");
        int c=inp2.nextInt();
        int d=((b*b)-4*(a*c));
        if(d>0){
            System.out.println("Real and Distinct Roots");
        }
        else if(d==0)
        {
            System.out.println("Real and Equal Roots");
        }
        else{
            System.out.println("Imaginary Roots");
        }
        double r=(-b+Math.sqrt(d))/(2*a);
        double r1=(-b-Math.sqrt(d))/(2*a);
        System.out.println("Real Roots are "+r+"and "+r1);
    }
}
