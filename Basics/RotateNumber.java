import java.util.*;

public class RotateNumber {

   public static void main(String[] args) {
      // write your code here

      try (Scanner scan = new Scanner(System.in)) {
         int n = scan.nextInt();
         int k = scan.nextInt();
         // count
         int nod = 0;
         int temp = n;
         while (temp != 0) {
            temp = temp / 10;
            nod++;
         }
         k = k % nod;
         if (k < 0)
            k = k + nod;

         int div = 1, multi = 1;
         for (int i = 1; i <= nod; i++) {
            if (i <= k)
               div *= 10;
            else
               multi *= 10;
         }

         int quotient = n / div;
         int remainder = n % div;

         int r = remainder * multi + quotient;

         System.out.println(r);
      }
   }
}