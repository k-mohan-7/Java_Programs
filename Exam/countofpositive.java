import java.util.*;

public class countofpositive {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String input;
        int p = 0, ne = 0, z = 0;

        do {
            System.out.print("Enter a number (or any non-digit to exit): ");
            input = inp.next();

            if (input.matches("-?\\d+")) {
                int n = Integer.parseInt(input);
                if (n < 0) {
                    ne++;
                } else if (n > 0) {
                    p++;
                } else {
                    z++;
                }
            }
        } while (input.matches("-?\\d+"));

        System.out.println("Positive numbers: " + p);
        System.out.println("Negative numbers: " + ne);
        System.out.println("Zeros: " + z);

        inp.close();
    }
}