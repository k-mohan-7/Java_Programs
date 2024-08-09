import java.util.*;
public class Count_low_upp_num_untill_start{ 
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int upper=0;
        int lower=0;
        int number=0;
        char s;
        do{
            System.out.println("Enter any character");
             s=inp.next().charAt(0);
            if(Character.isUpperCase(s))
            {
               upper++;
            }
            else if(Character.isLowerCase(s))
            {
                lower++;
            }
            else if(Character.isDigit(s))
            {
                number++;
            }
        }
        while(s!='*');
        System.out.println("Lower Case"+lower);
        System.out.println("Upper"+upper);
        System.out.println("Numbers"+number);
    }

}
