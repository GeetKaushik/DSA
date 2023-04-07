import java.util.*;

public class RingRotate {

    public static void main(String[] args) throws Exception {
        try (// write your code here
        Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[][] arr = new int[n][m];
            
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[0].length; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }
            
            int s = scn.nextInt();
            int r = scn.nextInt();
            
            display(arr);
            System.out.println();
            rotateShell(arr, s, r);
            display(arr);
        }
    }
    
    public static void rotateShell(int[][] arr, int s, int r) {
        int[] Oned = fill_Oned_from_Shell(arr, s);
        rotate(Oned, r);
        fill_Shell_from_Oned(arr, s, Oned);
    }
    
    public static int[] fill_Oned_from_Shell(int[][] arr, int s) {
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        
        int lw = maxr - minr;
        int bw = maxc - minc;
        int sz = 2*(lw + bw);
        int[] Oned = new int[sz];
        int idx = 0;
        
        //left wall
        for(int i = minr, j = minc; i <= maxr; i++) {
            Oned[idx] = arr[i][j];
            idx++;
        }
        
        // bottom wall
        for(int i = maxr, j = minc + 1; j <= maxc; j++) {
            Oned[idx] = arr[i][j];
            idx++;
        }
    
        //right wall
        for(int i = maxr - 1, j = maxc; i >= minr; i--) {
            Oned[idx] = arr[i][j];
            idx++;
        }
        
        //top wall
        for(int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            Oned[idx] = arr[i][j];
            idx++;
        }
        
        return Oned;
    }
    
    public static void fill_Shell_from_Oned(int[][] arr, int s, int[] Oned) {
        int minr = s - 1, minc = s - 1;
        int maxr = arr.length - s, maxc = arr[0].length - s;
        int idx = 0;
        
        //left wall
        for(int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j] = Oned[idx];
            idx++;
        }
        
        // bottom wall
        for(int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j] = Oned[idx];
            idx++;
        }
    
        //right wall
        for(int i = maxr - 1, j = maxc; i >= minr; i--) {
            arr[i][j] = Oned[idx];
            idx++;
        }
        
        //top wall
        for(int i = minr, j = maxc - 1; j >= minc + 1; j--) {
            arr[i][j] = Oned[idx];
            idx++;
        }
    }
    
    public static void rotate(int[] Oned, int r) {
        r = r % Oned.length;
        if(r < 0) r = r + Oned.length;
        
        reverse(Oned, 0, Oned.length - r - 1);
        reverse(Oned, Oned.length - r, Oned.length - 1);
        reverse(Oned, 0, Oned.length - 1);
    }
    
    public static void reverse(int[] Oned, int li, int ri) {
        while(li < ri) {
            int temp = Oned[li];
            Oned[li] = Oned[ri];
            Oned[ri] = temp;
            
            li++;
            ri--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}