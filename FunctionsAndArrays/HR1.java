import java.util.*;

public class HR1 {

    public static void main(String[] args) {
        try (// try (/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in)) {
            String str = "";
            int n = 0;
            for(int i = 0; i < 32; i++) System.out.print("=");
            System.out.println();
            for(int i = 0; i < 3; i++){
                str = scn.next();
                n = scn.nextInt();
                System.out.printf("%-15s%03d\n",str,n);
            }
        } 
            for(int i = 0; i < 32; i++) System.out.print("=");
        System.out.println();
        
        }
}
