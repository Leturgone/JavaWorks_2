package Work14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Chekparol {
    public static void main(String[] args) {
        String ginput = "F032_Password";
        String binput="smart_pass,";
        String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*_)(?=\\S+$).{8,}$";
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
