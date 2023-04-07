import java.util.Scanner;

class PrintAllPalindromic {
    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            soultionstr(str);
        }
        
    }
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i <= j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static void soultionstr(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrome(ss)) {
                    System.out.println(ss);
                }                
            }
            
        }
    }   
}