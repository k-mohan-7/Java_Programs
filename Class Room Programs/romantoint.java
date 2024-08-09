import java.util.*;
public class romantoint {
    public static int valueof(char s)
    {
        switch(s)
        {
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default:return 0;
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        int v=0,v1,t=1;
        for(int i=0;i<s.length();i++)
        {
             v=valueof(s.charAt(i));
             v1=valueof(s.charAt(i+1));
             if(v<v1)
             {
                t-=v;
             }
             else {
                t+=v;
             }
        }
        System.out.println("the Number is"+t);
    }
}
