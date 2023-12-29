package Work13.work136;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя файла: ");
        Scanner console = new Scanner(System.in);
        String num = console.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(num))) {
            String fileContent = reader.readLine();
            String[] words = fileContent.split(" ");
            List<String> result = new ArrayList<>();

            result.add(words[0]);
            words[0] = "";

            while (true) {
                boolean found = false;
                for (int i = 1; i < words.length; i++) {
                    if (words[i].isEmpty()) {
                        continue;
                    }
                    if (Character.toLowerCase(result.get(result.size() - 1).charAt(result.get(result.size() - 1).length() - 1)) == Character.toLowerCase(words[i].charAt(0))) {
                        result.add(words[i]);
                        words[i] = "";
                        found = true;
                    }
                }
                if (!found) {
                    break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (String word : result) {
                sb.append(word).append(" ");
            }

            System.out.println(sb.toString().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


