import java.util.*;
public class Patterns13{
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
           /* for(int i = 1; i <= n; i++){
                int val = 1;
                for(int j = 1; j <= i; j++){
                    System.out.print(val + "\t");
                    // val = val*(i-j)/(j+1);
                    val = val*(i-j)/(j);
                    
                }
                System.out.println();
            } */
            for (int i = 0; i < n; i++) {
                int val = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(val+"\t");
                    val = val*(i-j)/(j+1); 
                }
                System.out.println();
            }
        }


    }
}