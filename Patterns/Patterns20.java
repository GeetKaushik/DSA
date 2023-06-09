import java.util.*;

public class Patterns20 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if ((j == 1 || j == n) || (i > n / 2 && (i == j || i + j == n + 1))) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        }

    }
}