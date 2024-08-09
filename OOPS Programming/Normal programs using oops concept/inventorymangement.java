import java.util.*;
class inventory{
    int rawgoods=20;
    int storegoods=0;
    int productiongoods=0;
    int inputgoods=0;
    void raw()
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the no.of Raw materials required");
        int r=inp.nextInt();
        rawgoods+=r;
    }
    void production()
    {
        Scanner inp1=new Scanner(System.in);
        System.out.println("Enter the Raw material requred in tons");
        int i=inp1.nextInt();
        if(i>rawgoods||(rawgoods-i)<10)
        {
            System.out.println("Reached Reorder Limit please refill the Raw Materials\n1.Fill Raw Materials\n2.Exit");
            int l=inp1.nextInt();
            if(l==1)
            {
                raw();
            }
            else if(l==2)
            {
                System.out.println("You had Stoped Production");
                
            }
            else{
                System.out.println("Enter correct Input");
            }
        }
        else{
            productiongoods+=i;
        }
        System.out.println("Enter\n1.To store in Stores2.Production unti");
        int o=inp1.nextInt();
        if(o==1)
        {
           storegoods=productiongoods;
           productiongoods=productiongoods-storegoods;
        }
    }
    void store(){
        Scanner inp=new Scanner(System.in);
          System.out.println("Enter \n1.Sell products\n2.Leave in STORE");
          int o=inp.nextInt();
          if(o==1)
          {
            System.out.println("Enter the Quantity of Goods to Sell");
            int q=inp.nextInt();
            if(q==0)
            {
                System.out.println("Store is empty please fill the store \n Moving to production");

            }
            if(q>storegoods||(storegoods-q)<10)
            {
                System.out.println("Error\n Reaced Limit Enter \n1.To Fill store 2. Exit");
                int o1=inp.nextInt();
                if(o1==1)
                {
                    System.out.println("Moving to Production plese do required");
                    production();
                }
                else{
                    System.out.println("Stoped the Sale");
                }
            }
            else{
                System.out.println("your Sale was Made Successfully");
            }
          }
    }
}
public class inventorymangement {
    public static void main(String[] args)
    {
     inventory in=new inventory();
     in.production();
     in.store();
    }
}
