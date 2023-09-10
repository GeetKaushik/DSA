import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            int n = scn.nextInt();

            int res = power(x, n);
            System.out.println(res);
        }
    }
    public static int power(int x, int n) {
        if (x == 0 && n == 0) {
            System.out.println("undefined");
            return -1;
        }
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        return x*power(x, n-1);
    }
}
