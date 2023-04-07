import java.util.*;

public class HR2 {

    public static void main(String[] args) {
        try (/*
              * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
              * class should be named Solution.
              */
                Scanner scn = new Scanner(System.in)) {
            int q = scn.nextInt();
            scn.nextLine();
            int a = 0, b = 0, n = 0;
            for (int i = 0; i < q; i++) {
                String s = scn.nextLine();
                String[] sarr = s.split(" ");
                a = Integer.parseInt(sarr[0]);
                b = Integer.parseInt(sarr[1]);
                n = Integer.parseInt(sarr[2]);
                int sum = a + b;
                for (int j = 1; j <= n; j++) {
                    System.out.print(sum + " ");
                    sum += b * (int) Math.pow(2, j);
                }
                System.out.println();
            }
        }
    }
}
