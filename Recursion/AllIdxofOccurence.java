// import java.util.ArrayList;
import java.util.Scanner;

public class AllIdxofOccurence {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
            int x = scn.nextInt();
            int[] iarr = allidx(arr, 0, x, 0);
            for (int i : iarr) {
                System.out.print(i + " ");
            }
        }
    }
    public static int[] allidx(int[] arr, int idx, int x, int c) {
        if (idx == arr.length) {
            return new int[c];
        }
        if(arr[idx] == x) {
            int[] iarr = allidx(arr, idx+1, x, c + 1);
            iarr[c] = idx;
            return iarr;
        } else {
            int[] iarr = allidx(arr, idx+1, x, c);
            return iarr;
        }
    }

    /*
     * public static ArrayList allidx(int[] arr,ArrayList<Integer> list, int idx,
     * int x) {
     * if (idx == arr.length) {
     * return list;
     * }
     * if(arr[idx] == x) {
     * list.add(idx);
     * }
     * allidx(arr, list, idx+1, x);
     * return list;
     */
}
