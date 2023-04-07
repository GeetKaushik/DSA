import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {
        try (// write your code here
                Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int a = 0;
            int b = 1;
            for (int i = 0; i <= n; i++) {
                System.out.println(a);
                int c = a + b;
                a = b;
                b = c;
            }
        }
    }
}