import java.util.ArrayList;
import java.util.Scanner;

public class RemovePrimesfromArrayList {
    public static void RemovePrimes(ArrayList<Integer> a) {
        for (int i = a.size() - 1; i >= 0; i--) {
            if(isPrime(a.get(i))) a.remove(i);
        }
    }
    public static boolean isPrime(int a) {
        for (int i = 2; i*i <= a; i++) {
            if (a%i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scn.nextInt());
            }
            RemovePrimes(a);
            System.out.println(a);
        }
    }
}