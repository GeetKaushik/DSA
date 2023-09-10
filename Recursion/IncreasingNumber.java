import java.util.Scanner;

public class IncreasingNumber {
    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            printIncreasing(n);
        }
    }
}