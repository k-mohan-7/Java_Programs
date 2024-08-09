import java.util.*;
public class removingvowels {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String s=inp.nextLine();
        s=s.replaceAll("[aeiou]",""); 
        System.out.println(s);
    }
}
