import java.util.*;

public class Patterns14 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int x = scn.nextInt();
            
            for(int i = 1; i <= 10; i++){
                System.out.println(x +" * "+ i + " = " + x*i);
            }
        }
    }
}