import java.util.*;
class bill{
    String coustomer_no;
    String Coustomer_name;
    int previous_redings;
    int current_redings;
    double bill;
    void custno(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Enteer the Coustomer Number:");
        coustomer_no=inp.nextLine();
        System.out.println("Enteer the Coustomer Name:");
        Coustomer_name=inp.nextLine();
        System.out.println("Enteer the Previous Readings");
        previous_redings=inp.nextInt();
        System.out.println("Enteer the Current Readings:");
        current_redings=inp.nextInt();
    }
    void calc_bill_amount()
    {
        if(current_redings<=100)
        {
             bill=current_redings*1;
        }
        if(current_redings<=200 && current_redings>100)
        {
             bill=current_redings*2.50;
        }
        if(current_redings<=500&& current_redings>200)
        {
             bill=current_redings*4;
        }
        if(current_redings>500)
        {
             bill=current_redings*6;
        }
    }
    void display(){
        System.out.println("Coustomer Number:"+coustomer_no);
        System.out.println("Coustomer Name:"+Coustomer_name);
        System.out.println("Previous Readings:"+previous_redings);
        System.out.println("Current Readings:"+current_redings);
        System.out.println("Total Amount:"+bill);
        
    }
}
public class electricitybill {
    public static void main(String[] args)
    {
       bill b=new bill();
       b.custno();
       b.calc_bill_amount();
       b.display();
    }
}
