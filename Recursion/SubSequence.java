import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.nextLine();
            ArrayList<String> res = getss(str);
            System.out.println(res);
        }
    }
    public static ArrayList<String> getss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = getss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add(""+rstr);
        }
        for (String rstr : rres) {
            mres.add(ch + rstr);
        }
        return mres;
    }
}
