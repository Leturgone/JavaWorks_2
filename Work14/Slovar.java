package Work14;

import java.util.HashMap;
import java.util.Map;

public class Slovar {
    public static void main(String[] args) {
        String text = "abcda";

        // Преобразуем текст в нижний регистр и удаляем все не-буквы при посощи регулярных выраженйи
        String cleanText = text.toLowerCase().replaceAll("[^a-z]", "");
        //Создание часточного словаря
        int[] frequencyArray = new int[26];
        for (char c : cleanText.toCharArray()) {
            frequencyArray[c - 'a']++;
        }

        // Выводим частотный словарь
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frequencyArray[i]);
            }
        }
    }
}
