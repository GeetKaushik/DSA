import java.util.*;
public class Patterns16{
public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
        int n = scn.nextInt();
        int st = 1;
        int sp = 2*n-3;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= st; j++) System.out.print(j+"\t");
            for(int j = 1; j <= sp; j++) System.out.print("\t");
            if(i!=n) for(int j = st; j >= 1; j--) System.out.print(j+"\t");
            else for(int j = st-1; j >= 1; j--) System.out.print(j+"\t");
            System.out.println();
            sp-=2;
            st++;
        }
    }

 }
}