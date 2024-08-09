import java.util.*;

public class dup {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a[] = new int[100];
        System.out.println("Enter the no.of elements");
        int n = inp.nextInt();
        System.out.println("Enter a array elements");
        for (int l = 0; l < n; l++) {
            Scanner inp1 = new Scanner(System.in);

            System.out.println("enter teh element of" + l);
            a[l] = inp1.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                 for (int j = n; j > i; j--) {
               
                    a[j] = a[j - 1];
                    
                }
               i++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}