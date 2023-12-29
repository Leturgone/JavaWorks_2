package Work18.work188;


import java.util.Scanner;

public class ThrowsDemo {
    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }
    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    private static String getDetails(String key) {
        try {
            if (key.equals("")) {
                throw new Exception("Key set to empty string");
            }
            return "data for " + key;
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Please enter the key again:");
            getKey();
            return "";
        }
    }

    public static void main(String[] args) {
        getKey();
    }
}