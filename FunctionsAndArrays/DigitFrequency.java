import java.util.*;

public class DigitFrequency {

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while (n > 0) {
            int res = n % 10;
            if (res == d)
                count++;
            n = n / 10;
        }
        return count;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int d = scn.nextInt();
            int f = getDigitFrequency(n, d);
            System.out.println(f);
        }
    }
}