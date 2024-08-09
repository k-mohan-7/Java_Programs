import java.util.*;
public class apractice{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        String s=inp.nextLine();
        int l=s.length();
        int special=0;
        for (int j = 0; j < l; j++) {
            
        
       if((s.charAt(j)>='a'&&s.charAt(j)<='z')||(s.charAt(j)>='A'&&s.charAt(j)<='Z')||(s.charAt(j)>='0'&&s.charAt(j)<='9'))
       {
        
                continue;
            
       }
       else if(s.charAt(j)!=' ')
       {
        special+=1;
                        System.out.print(s.charAt(j)+" ");

       }
              

    }      
     System.out.println("\nCount of special characters is:"+special);

    }
}