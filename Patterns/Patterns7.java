import java.util.Scanner;

public class Patterns7 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            for (int i = 1; i <= n; i++){
                System.out.println("*");
                for (int j = 1; j <= i; j++) System.out.print("\t");
            }
        }
    }
}
