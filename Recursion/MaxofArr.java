import java.util.Scanner;

public class MaxofArr {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(printMax(arr,0));
        }
    }
    public static int printMax(int[] arr, int i) {
        if(i == arr.length - 1) {
            return arr[i];
        }
        int max = printMax(arr, i+1);
        if (max > arr[i]) {
            return max;
        }else {
            return arr[i];
        }
    }
}
