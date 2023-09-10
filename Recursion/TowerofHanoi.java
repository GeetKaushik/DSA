import java.util.Scanner;

public class TowerofHanoi {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            char a = scn.next().charAt(0);
            char b = scn.next().charAt(0);
            char c = scn.next().charAt(0);
            
            toh(n, a, b, c);
        }
    }
    public static void toh(int n, int a, int b, int c) {
        if(n == 0) {
            return;
        }
        toh(n - 1, a, c, b);
        System.out.printf("%d[%c -> %c]\n",n,a,b);
        toh(n - 1, c, b, a);

    }
}
