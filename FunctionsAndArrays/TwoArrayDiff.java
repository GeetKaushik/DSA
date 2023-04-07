import java.util.*;

public class TwoArrayDiff {

    public static void main(String[] args) throws Exception {
        try (Scanner scn = new Scanner(System.in)) {
            // Scanning both arrays
            int n1 = scn.nextInt();
            int[] a1 = new int[n1];
            for (int i = 0; i < a1.length; i++) {
                a1[i] = scn.nextInt();
            }
            int n2 = scn.nextInt();
            int[] a2 = new int[n2];
            for (int i = 0; i < a2.length; i++) {
                a2[i] = scn.nextInt();
            }

            // Creating another diff array in which we will add our difference
            int[] diff = new int[n2];
            int c = 0; // carry initialize
            int i = a1.length - 1; // initialize counter pointing at max for 1st array (a1)
            int j = a2.length - 1; // initialize counter pointing at max for 2nd array (a2)
            int k = diff.length - 1; // initialize counter pointing at max for diff array

            // logic for difference
            while (k >= 0) {
                int a1v = i >= 0 ? a1[i] : 0; // created to handle case if i < j

                if (a2[j] + c >= a1v) {
                    diff[k] = a2[j] + c - a1v;
                    c = 0;
                } else {
                    diff[k] = a2[j] + c + 10 - a1v;
                    c = -1;
                }

                i--;
                j--;
                k--;

            }
            // to discard leading zeros
            int idx = 0;
            while (idx < diff.length) {
                if (diff[idx] == 0)
                    idx++;
                else
                    break;
            }
            // print the difference of two arrays
            while (idx < diff.length) {
                System.out.println(diff[idx++]);
            }
        }
    }

}