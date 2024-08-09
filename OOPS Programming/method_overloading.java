import java.util.*;
 class car{
      String name;
      String milage;
      int price;
      void speed()
      {
        System.out.println("Carr is runnig sppeed");
        
      }
      void speed(String name)
      {
        System.out.println(name+"Car is running very Fast");
      }
      void speed(String name,String milage,int price)
      {
        System.out.println(name+"Car is running with Milage"+milage+"Which cost around ruppes "+price);
      }
}
public class method_overloading {
    public static void main(String[] args) {
        System.out.println("Enter the Car name");
        Scanner inp=new Scanner(System.in);
        String n=inp.nextLine();
        System.out.println("enter the Milage of car ");
        String m=inp.nextLine();
        System.out.println("Enter the Cost of car");
        int c=inp.nextInt();
        car c1=new car();
        c1.speed();
        c1.speed(n);
        c1.speed(n,m,c);
    }    
}
