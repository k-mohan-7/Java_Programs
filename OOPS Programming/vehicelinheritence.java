import java.util.*;
class vehicle{
    String owner;
    String license;
}
class car extends vehicle{
    String color;
    String model;
    int manfyear;
int cost;
void getdata()
{   
    Scanner inp=new Scanner(System.in);
    System.out.println("Entr owner namme");
    owner=inp.nextLine();
    System.out.println("Entr color");
    color=inp.nextLine();
    System.out.println("Entr model name");
    model=inp.nextLine();
    System.out.println("Entr manfyear");
    manfyear=inp.nextInt();
    System.out.println("Entr license");
    license=inp.nextLine();
    
}
void display(){
    System.out.println("car owner"+owner);
    System.out.println("car license"+license);
    System.out.println("car model "+model);
    System.out.println("car  manfyear"+manfyear);
    System.out.println("car model"+model);
    System.out.println("car cost"+cost);
    
}
}
class truck extends vehicle{
    
    String model;
    int manfyear;
int cost;
int capacity;
void getdata()
{   
    Scanner inp=new Scanner(System.in);
    System.out.println("Entr owner namme");
    owner=inp.nextLine();
    System.out.println("Entr capaacity");
    capacity=inp.nextInt();
    System.out.println("Entr model name");
    model=inp.nextLine();
    System.out.println("Entr manfyear");
    manfyear=inp.nextInt();
    System.out.println("Entr license");
    license=inp.nextLine();
    
}
void display(){
    System.out.println("Truck owner"+owner);
    System.out.println("Truck license"+license);
    System.out.println("Truck model "+model);
    System.out.println("Truck  manfyear"+manfyear);
    System.out.println("Truck model"+model);
    System.out.println("Truck cost"+cost);
    System.out.println("Truck Capacity"+capacity);
    
}
}
class motorcycle extends vehicle{
    String color;
    String model;
    int manfyear;
int cost;
int milage;
void getdata()
{   
    Scanner inp=new Scanner(System.in);
    System.out.println("Entr owner namme");
    owner=inp.nextLine();
    System.out.println("Entr color");
    color=inp.nextLine();
    System.out.println("Entr model name");
    model=inp.nextLine();
    System.out.println("Entr manfyear");
    manfyear=inp.nextInt();
    System.out.println("Entr milage");
    milage=inp.nextInt();
    System.out.println("Entr license");
    license=inp.nextLine();
    
}
void display(){
    System.out.println("Motor Cycle owner"+owner);
    System.out.println("Motor Cycle license"+license);
    System.out.println("Motor Cycle model "+model);
    System.out.println("Motor Cycle  manfyear"+manfyear);
    System.out.println("Motor Cycle model"+model);
    System.out.println("Motor Cycle cost"+cost);
    System.out.println("Motor Cycle milage"+milage);
    
}
}
public class vehicelinheritence {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Entter \n1.for Truck\n2.for Car\n3.for MotorCycle");
        int n=inp.nextInt();
        vehicle v= new vehicle();
        car c=new car();
        truck t=new truck();
        motorcycle m=new motorcycle();

        switch(n)
        {
            case 1:
            t.getdata();
            t.display();
            break;
            case 2:
            c.getdata();
            c.display();
            case 3:
            m.getdata();
            m.display();
        }
    }
    
}
