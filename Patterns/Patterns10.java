import java.util.*;

public class Patterns10{

public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        // write ur code here
        int n = scn.nextInt();
        
        int os = n/2;
        int is = -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= os; j++) System.out.print("\t");
            System.out.print("*\t");
            for(int j = 1; j <= is; j++) System.out.print("\t");
            if(i>1 && i<n) System.out.print("*\t");
            if(i<=n/2){
                is+=2;
                os--;
            }
            else{
                is-=2;
                os++;
            }
            System.out.println();
        }
    }
 }
}