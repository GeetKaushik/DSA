import java.util.Scanner;

public class SearchinSorted2D {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[][] arr = new int[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }
            int x = scn.nextInt();
            
            int i = 0;
            int j = arr.length - 1;
            while (i < arr.length && j >= 0) { 
                if (x == arr[i][j]) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
                else if(x > arr[i][j]) i++;
                else if(x < arr[i][j]) j--;
            }
            System.out.println("Not Found");
        }

    }
}