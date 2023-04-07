import java.util.Scanner;

public class PermutationsofString {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String s = scn.next();
            pString(s);
        }
    }

    public static void pString(String s) {
        int n = s.length();
        int f = factorial(n);
        for (int i = 0; i < f; i++) {
            int temp = i;
            StringBuilder sb = new StringBuilder(s);
            for (int j = n; j >= 1; j--) {
                int q = temp / j;
                int r = temp % j;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                temp = q;
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        int val = 1;
        for (int i = n; i > 0; i--) {
            val *= i;
        }
        return val;
    }
}
