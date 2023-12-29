package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekDate {
    public static void main(String[] args) {
        String ginput = "29/02/2000";
        String binput="1/1/1899.";
        String regex="\\d*/\\d*/\\d*";
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
