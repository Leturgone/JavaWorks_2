package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekPlus {
    public static void main(String[] args) {
        String ginput = "(1 + 8) – 9 / 4";
        String regex="\\d[^+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(ginput);
        if (m.find()) {
            System.out.println("Является");
        }
        else{
            System.out.println("Не является");
        }
    }
}
