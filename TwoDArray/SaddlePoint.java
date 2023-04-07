import java.util.*;

public class SaddlePoint {

    public static void main(String[] args) throws Exception {
        try (// write your code here
        Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[][] arr = new int[n][n];
            
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr.length; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }
        
            for(int i = 0; i < arr.length; i++) {
                int svj = 0;
                for(int j = 0; j < arr.length; j++) {
                    if(arr[i][j] < arr[i][svj]) svj = j;
                }
                boolean SaddlePoint = true;
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k][svj] > arr[i][svj]) {
                        SaddlePoint = false;
                        break;
                    }
                }
                if (SaddlePoint) {
                    System.out.println(arr[i][svj]);
                    return;
                }
            }
            System.out.println("Invalid input");
        }
        
    }

}