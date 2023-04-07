import java.util.*;

public class DecimaltoAnyBase {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int b = scn.nextInt();
            int dn = getValueInBase(n, b);
            System.out.println(dn);
        }
    }

    public static int getValueInBase(int n, int b) {
        int rv = 0;
        // int i = 0;
        int i = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            // rv += dig * (int) Math.pow(10, i++);
            rv += dig * i;
            i = i*10;
        }
        return rv;

    }
}