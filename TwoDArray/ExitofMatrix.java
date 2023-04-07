import java.util.*;

public class ExitofMatrix {

    public static void main(String[] args) throws Exception {
        try (// write your code here
                Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[][] a = new int[n][m];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = scn.nextInt();
                }
            }

            int i = 0, j = 0;
            int dir = 0;

            while (true) {
                dir = (dir + a[i][j]) % 4;

                if (dir == 0)
                    j++; // east
                else if (dir == 1)
                    i++; // south
                else if (dir == 2)
                    j--; // west
                else if (dir == 3)
                    i--; // north

                // Exit Points

                if (i < 0) {
                    i++;
                    break;
                } else if (j < 0) {
                    j++;
                    break;

                } else if (i == a.length) {
                    i--;
                    break;
                } else if (j == a[0].length) {
                    j--;
                    break;
                }
            }

            System.out.println(i);
            System.out.println(j);
        }

    }

}