import java.util.ArrayList;
import java.util.Scanner;

public class NumberKeypad {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String num = scn.next();
            ArrayList<String> words = getKPC(num);
            System.out.println(words);
        }
    }
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String num) {
        if (num.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = num.charAt(0);
        String ros = num.substring(1);
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codesforch = codes[Character.getNumericValue(ch)];
        for (int i = 0; i < codesforch.length(); i++) {
            char chcode = codesforch.charAt(i);
            for (String rstr : rres) {
                mres.add(chcode+rstr);
            }
        }
        return mres;
    }
}
