import java.util.*;

public class GCD_LCM {

  public static void main(String[] args) {
    try (// write your code here
    Scanner scan = new Scanner(System.in)) {
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int onum1 = num1;
        int onum2 = num2;
        while(num1 % num2 != 0){
            int remainder = num1%num2;
            num1 = num2;
            num2 = remainder; 
        }
        int GCD = num2;
        int LCM = (onum1*onum2)/GCD;
        System.out.println(GCD);
        System.out.println(LCM);

        //***************Alt method*****************{Less efficient}
        // for (GCD = num1; GCD >= 1; GCD--) {
        //   if (num1 % GCD == 0 && num2 % GCD == 0) {
        //     System.out.println(GCD);
        //     break;
        //   }
        // }
        // LCM = (num1*num2)/GCD;
        // System.out.println(LCM);
    }
  }
}
