package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChekMail {
    public static void main(String[] args) {
        String ginput = "user@example.com";
        String binput="myhost@@@com.ru,";
        String regex="[a-zA-Z]@[a-zA-Z]\\.?[a-zA-Z]";
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
