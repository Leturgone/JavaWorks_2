package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakePrices {

    public static void main(String[] args) {
        String input = "25 EUR, 25.97 RUB, 25.98 USD, 44 ERR, 0.004 EU. ";
        Pattern pattern = Pattern.compile("(\\d+\\.?\\d*)\\s*(USD|RUB|EUR)");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.println(input.substring(matcher.start(), matcher.end()));
        }
    }
}
