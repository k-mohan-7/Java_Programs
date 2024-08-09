import java.util.*;
public class transpose {
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in)
        ;
        System.out.println("Ente no.of elements rewquereid");
        int n=inp.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the input");
                a[i][j]=inp.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]=a[j][i];
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
