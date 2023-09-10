import java.util.Scanner;

public class LIdxofOccurence {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int x = scn.nextInt();
            System.out.println(lastidx(arr, arr.length - 1, x));
        }
    }
    public static int lastidx(int[] arr, int idx, int x) {
        if (idx < 0) {
            return -1;
        }
        if(arr[idx] == x) {
            return idx;
        } else {
            int lidx = lastidx(arr, idx - 1, x);
            return lidx;
        }
    }
}
