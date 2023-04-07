import java.util.Scanner;

public class PrintDigitsofN {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();

            int temp = n;
            int count = 0;
            
            while (temp > 0){
                temp = temp/10;
                count++;
            }

            int div = (int)Math.pow(10,count-1);

            for (int i = div; i >= 1; i/=10) {
                System.out.println(n/i);
                n = n%i;
            }
        }
        
    }
}
