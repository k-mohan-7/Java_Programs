import java.util.*;
public class numeric_to_Roman {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=inp.nextInt();
        String thou[]={"","M","MM","MMM"};
        String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String one[]={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String re="";
        while(n!=0)
        { if(n>=1000 && n<3999){
            int r=n%1000;
            n/=1000;
        }
        if(n>=100 && n<)
            r=n%100;
            re+=hund[r];
            r=n%10;
            re+=one[r];
        }
        System.out.println(re);
    }
}
