package Work18.work186;

public class ThrowsDemo {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static String getDetails(String key) {
        try {
            if (key == "") {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        }
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            return "data for " + key;
        }
    }

    public static void main(String[] args) {

        printMessage("");
    }
}