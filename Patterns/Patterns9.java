import java.util.*;
public class Patterns9 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            // write ur code here
            int n = scn.nextInt();
            
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(i == j || i+j == n-1){
                        System.out.print("*\t");
                    }
                    else System.out.print("\t");
                }
                System.out.println();
            }
        }

    }
}