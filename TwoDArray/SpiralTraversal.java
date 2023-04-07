import java.util.*;

public class SpiralTraversal {

    public static void main(String[] args) throws Exception {
        try (// write your code here
        Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            
            int[][] a = new int[n][m];
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = scn.nextInt();
                }
            }
            // for(int i = 0; i < n; i++){
            //     for(int j = 0; j < m; j++){
            //         System.out.print(a[i][j]+" ");
            //     }
            //     System.out.println();
            // }
            
            int minr = 0, minc = 0;
            int maxr = a.length - 1, maxc = a[0].length - 1;
            int count = 0;
            int total_elements = n*m;
            
            while(count < total_elements) {
                for(int i = minr, j = minc; i <= maxr && count < total_elements; i++) {
                    System.out.println(a[i][j]);
                    count++;
                }
                minc++;
                for(int i = maxr, j = minc; j <= maxc && count < total_elements; j++) {
                    System.out.println(a[i][j]);
                    count++;
                }
                maxr--;
                for(int i = maxr, j = maxc; i >= minr && count < total_elements; i--) {
                    System.out.println(a[i][j]);
                    count++;
                }
                maxc--;
                for(int i = minr, j = maxc; j >= minc && count < total_elements; j--) {
                    System.out.println(a[i][j]);
                    count++;
                }
                minr++;
            }
        }
    }

}