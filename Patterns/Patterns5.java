import java.util.*;

public class Patterns5 {

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            // write ur code here
            int n = scn.nextInt();
            int sp = n/2;
            int st = 1;
            for(int i = 1; i <= n; i++){
                if(i<=n/2){
                    for(int j = 1; j <= sp; j++) System.out.print("\t");
                    for(int k = 1; k <= st; k++) System.out.print("*\t");
                    sp--;
                    st+=2;
                }
                else{
                    for(int j = 1; j <= sp; j++) System.out.print("\t");
                    for(int k = 1; k <= st; k++) System.out.print("*\t");
                    sp++;
                    st-=2;
                }
                System.out.println();
            }
        }

    }
}