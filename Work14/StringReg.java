package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReg {
    public static void main(String[] args) {
        String input = "Your Input 45678String";
        String regex ="[0123456789]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(input.substring(matcher.start(), matcher.end()));
        }
    }
}
