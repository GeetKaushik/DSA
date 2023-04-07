import java.util.*;

public class MatrixMultiplication {

    public static void main(String[] args) {
        try (// write your code here
                Scanner scn = new Scanner(System.in)) {
            int n1 = scn.nextInt();
            int m1 = scn.nextInt();
            // First matrix
            int[][] a = new int[n1][m1];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            int n2 = scn.nextInt();
            int m2 = scn.nextInt();
            // Second matrix
            int[][] b = new int[n2][m2];
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    b[i][j] = scn.nextInt();
                }
            }

            if (m1 != n2) {
                System.out.println("Invalid input");
                return;
            }

            // multiplication of matrix
            int[][] c = new int[n1][m2];
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    for (int k = 0; k < m1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            // Ouput
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

}