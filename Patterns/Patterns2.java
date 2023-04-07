import java.util.*;

public class Patterns2 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            // write ur code here
            int n = scn.nextInt();
            
            for(int i = n; i >= 1; i--){
                for(int j = i; j >= 1; j--){
                    System.out.print("*\t");
                }
                System.out.println();
            }
        }
    }
}