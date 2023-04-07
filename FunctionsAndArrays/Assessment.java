import java.util.*;

public class Assessment {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int z = scn.nextInt();
            int count = 0;

            for (int x = 0; x * x <= z; x++) {
                int y = (int) Math.sqrt(z - (x * x));
                if (x * x + y * y == z) count++;
            }
            if (count!=0) System.out.println("Value Exist");
            else System.out.println("Value Does not exist");
        }
    }
}