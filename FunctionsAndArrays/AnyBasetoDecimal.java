import java.util.*;
  
  public class AnyBasetoDecimal{
  
  public static void main(String[] args) {
      try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
          int b = scn.nextInt();
          int d = getValueIndecimal(n, b);
          System.out.println(d);
    }
   }
  
   public static int getValueIndecimal(int n, int b){
      int rv = 0;
    //   int i = 0;
      int i = 1;
      while(n>0){
          int dig = n%10;
          n = n/10;
        //   rv += dig*(int)Math.pow(b,i++);
          rv += dig*i;
          i *= b;
      }
      return rv;
   }
  }