import java.util.*;

public class Patterns4 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            // write ur code here
            int n = scn.nextInt();
            
            for(int i = n; i >= 1; i--){
                for(int j = n; j > i; j--) System.out.print("\t");
                for(int k = 1; k <= i; k++) System.out.print("*\t");
                System.out.println();
            }
        }
        
    }
}