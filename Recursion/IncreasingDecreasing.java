import java.util.Scanner;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            printIncreasingDecresing(n);
        }
    }
    public static void printIncreasingDecresing(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printIncreasingDecresing(n-1);
        System.out.println(n);
    }
}
