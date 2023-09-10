import java.util.Scanner;

public class Logarithmic {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            int n = scn.nextInt();
            int res = power(x,n);
            System.out.println(res);
        }
    }
    public static int power(int x, int n) {
        if (x == 0 && n == 0) {
            System.out.println("Undefined");
            return -1;
        } else if(n == 0) {
            return 1;
        }

        if (n%2 == 0) {
            return power(x, n/2)*power(x, n/2);
        } else {
            return power(x, n/2)*power(x, n/2)*x;
        }
    }
}
