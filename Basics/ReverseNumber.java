import java.util.*;

public class ReverseNumber {

  public static void main(String[] args) {
    try (// write your code here
    Scanner scan = new Scanner(System.in)) {
        int n = scan.nextInt();
        
        while(n > 0){
            int d = n%10;
            System.out.print(d);
            n = n/10;
        }
    }
  }
}