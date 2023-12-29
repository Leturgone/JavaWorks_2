package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekStringReg {
    public static void main(String[] args) {
        String ginput = "abcdefghijklmnopqrstuv18340";
        String binput = "abcdefghijklmnoasdfasdpqrstuv18340.";
        String regex = "^abcdefghijklmnopqrstuv18340$";
        Pattern pattern = Pattern.compile(regex);
        if (Pattern.matches(regex, binput)) {
            System.out.println("Является");
        }
        else{
            System.out.println("Не является");
        }
    }
}
