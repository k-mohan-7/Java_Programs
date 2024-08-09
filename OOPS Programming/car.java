
class cardetails{
   int modelno;
   String carname;
   String color;
    void cardetails(int modelno,String carname,String color)
   {
    this.modelno=modelno;
    this.carname=carname;
    this.color=color;
   }
   public void paint(String color)
   {
    System.out.println("Car has been painted with colour"+color);
   }
}
public class car {
    public static void main(String[] args) {
        cardetails c=new cardetails();
        c.cardetails(32322,"Suzuki","red");
        c.paint("blue");
        System.out.println(c.modelno+" "+c.carname+" "+c.color);

    }
    
}
