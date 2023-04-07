import java.util.*;

public class FirstLastIndex {

    public static void main(String[] args) throws Exception {
        try (// write your code here
        Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = scn.nextInt();
            }

            int d = scn.nextInt();

            int first = -1;
            int last = -1;
            int l = 0;
            int r = a.length - 1;

            while (l <= r) {
                int mid = (l + r) / 2;
                if (d > a[mid]) {
                    l = mid + 1;
                } else if (d < a[mid]) {
                    r = mid - 1;
                } else {
                    last = mid;
                    l = mid + 1;
                }
            }
            l = 0;
            r = a.length - 1;
            while (l <= r) {
                int mid = (l + r) / 2;
                if (d > a[mid]) {
                    l = mid + 1;
                } else if (d < a[mid]) {
                    r = mid - 1;
                } else {
                    first = mid;
                    r = mid - 1;
                }
            }
            System.out.println(first);
            System.out.println(last);
        }

    }

}