import java.util.*;

public class AnyBasetoAnyBase {

  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase = scn.nextInt();
        int result = getValue(n, sourceBase, destBase);
        System.out.println(result);
    }
  }
  
  public static int getValue(int n, int b1, int b2) {
      
    int decimal = AnyBasetoDecimal(n, b1);
    int rv = DecimaltoAnyBase(decimal, b2);
    return rv;
    
  }
  
  public static int AnyBasetoDecimal(int n, int b) {
  
    int rv = 0;
    int p = 1;

    while (n > 0) {
      int dig = n % 10;
      n /= 10;

      rv += dig * p;
      p *= b;
    }
    
    return rv;
  }
  public static int DecimaltoAnyBase(int n, int b) {
    
    int rv = 0;
    int p = 1;

    while (n > 0) {
      int dig = n % b;
      n /= b;

      rv += dig * p;
      p *= 10;
    }
    
    return rv;
  }
}