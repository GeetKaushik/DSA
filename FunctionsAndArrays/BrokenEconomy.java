import java.util.*;

public class BrokenEconomy {

  public static void main(String[] args) throws Exception {
    try (Scanner scn = new Scanner(System.in)) {
        //Inputs
        int n = scn.nextInt();
        int[] aD = new int[n];

        for (int i = 0; i < aD.length; i++) {
          aD[i] = scn.nextInt();
        }

        int d = scn.nextInt();


        //Logic: Binary Search of element
        int l = 0;
        int r = aD.length - 1;
        int mid = (l + r) / 2;
        while (l <= r) {
          if (d > aD[mid]) {
            l = mid + 1;
            mid = (l + r) / 2;
          } else if (d < aD[mid]) {
            r = mid - 1;
            mid = (l + r) / 2;
          } else {
            System.out.println(aD[mid]);
            return;
          }

        }
        System.out.println(aD[mid + 1]);
        System.out.println(aD[mid]);
    }
  }

}