import java.util.*;
public class Grade_Aggreagate_of_Student {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter marks of Python");
        int py=inp.nextInt();
        System.out.println("Enter Marks of c program");
        int c=inp.nextInt();
        System.out.println("Enter Marks of Maths");
        int m=inp.nextInt();
        System.out.println("Enter marks of Physics");
        int p=inp.nextInt();
        int total=py+c+m+p;
        double ag=total/4;
        System.out.println("Total:"+total);
        System.out.println("Aggregate:"+ag);
        if(ag>75)
        {
            System.out.println("Distinction");

        }
        else if(ag<75&&ag>60)
        {
            System.out.println("First Division");
            
        }
        else if(ag>50&&ag<60)
        {
            System.out.println("Second Division");
            
        }
        else if(ag>40&&ag<50)
        {
            System.out.println("Third Division");
            
        }
    } 
}
