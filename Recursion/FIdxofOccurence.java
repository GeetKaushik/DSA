import java.util.Scanner;

public class FIdxofOccurence {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int x = scn.nextInt();
            System.out.println(firstIdx(arr, 0, x));
        }
    }
    public static int firstIdx(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        if(arr[idx] == x) {
            return idx;
        } else {
            int fidx = firstIdx(arr, idx+1, x);
            return fidx;
        }
    }
}
