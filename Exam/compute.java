import java.util.*;
public class compute {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=inp.nextInt();
        int c=(n+(n*n)+(n*n*n));
        System.out.println("The Computed result of the given element is  "+c);
        
    }
}
