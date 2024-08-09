class shape{
    int l;
    int b;
    void area()
    {
        System.out.println("calculates area");
    }
}
class traingle extends shape{
     void area(int l,int b)
     {
        System.out.println("the area of traingle is "+l*b);
     }
}
public class Inheritance {
    public static void main(String[] args) {
        shape s=new shape();
        s.l=5;
        s.b=6;
        s.area();
        traingle t=new traingle();
        t.area(s.l,s.b);
    }
}
