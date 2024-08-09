import java.util.*;
class calci{
    int a;
    int b;
    int c;
    calci(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void add(){
        System.out.println("Adddition"+(a+b));
    }
    void sub(){
        System.out.println("Subtraction"+(a-b));
    }
    void multi()
    {
        System.out.println("Multiplication"+(a*b))
        ;

    }
    void div()
    {
        System.out.println("Division"+(a/b));

    }
    void modulo()
    {
        System.out.println("Modules Operation"+(a%b));
    }
}
public class Basic_calci{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
      System.out.println("Enter the 1.Addition 2.Subtartion 3.division 4.multiplicaitn 5.modules");
      String n=inp.nextLine();
      System.out.println("Enter 1st element");
      int a=inp.nextInt();
      System.out.println("Enter the 2nd element")
      ;
      int b=inp.nextInt();
      calci c=new calci(a,b);
      
      switch(n)
      {
        case "1":c.add(); break;
        case "2":c.sub(); break;
        case "3":c.div(); break;
        case "4":c.multi(); break;
        case "5":c.modulo();break;
      }
    }
}