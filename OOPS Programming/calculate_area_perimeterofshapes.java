import java.util.*;
class shape{
    int l;
    int b;
    int h;
    int r;
    void area(){

    }
    void perimeter(){

    }
}
class circle extends shape{
    Scanner inp=new Scanner(System.in);
    void area(){
        System.out.println("Enter the radius of circle");
        r=inp.nextInt();
        double pi=3.14;
        System.out.println("Area of Circle is: "+(pi*(r*r)));
        }
        void perimeter()
            {
                System.out.println("Enter the radius of circle");
                r=inp.nextInt();
                double pi=3.14;
                System.out.println("Perimeter of Circle is: "+2*(pi*(r)));
            }
        
}
class square extends shape{
    Scanner inp=new Scanner(System.in);
    void area(){
        System.out.println("Enter the side of Square");
        l=inp.nextInt();
        System.out.println("Area of Square is: "+(l*l));
        }
        void perimeter()
            {
                System.out.println("Enter the side of Square");
        l=inp.nextInt();
                System.out.println("Perimeter of Square is: "+(4*l));
            }
        
}
public class calculate_area_perimeterofshapes {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter \n1.circle\n2.square");
        int n=inp.nextInt();
        circle c=new circle();
        square s=new square();
        switch(n)
        {
            case 1:
            c.area();
            c.perimeter();
            break;
            case 2:
            s.area();
            s.perimeter();
        }
    }
}
