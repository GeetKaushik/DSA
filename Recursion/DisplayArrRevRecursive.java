import java.util.Scanner;

public class DisplayArrRevRecursive {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            displayArrayRev(arr, n-1);
        }
    }
    public static void displayArrayRev(int[] arr, int idx) {
        if (idx < 0) {
            return;
        }
        System.out.println(arr[idx]);
        displayArrayRev(arr, idx - 1);
    }
}
