import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int res = factorial(n);
            System.out.println(res);
        }
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else if(n < 0) {
            return -1;
        } else if(n == 1) {
            System.out.println(n);
            return n*factorial(n-1);
        } else {
            System.out.print(n+"x");
            return n*factorial(n-1);
        }
    }
}
