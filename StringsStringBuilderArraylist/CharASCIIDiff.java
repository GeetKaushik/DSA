import java.util.Scanner;

public class CharASCIIDiff {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String s = scn.next();
            System.out.println(ASCIIDiff(s));
        }

    }
    public static String ASCIIDiff(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            int diff = curr - prev;
            sb.append(diff);    // Why this ?
            sb.append(curr);

            // sb.append(diff + curr); // Not this ?
        }
        return sb.toString();
    }
}
