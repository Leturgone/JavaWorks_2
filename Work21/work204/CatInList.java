package Work21.work204;

import Work21.work201.MassToList;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CatInList {
    public static <T> List<T> masstolist(T[] array){
        List <T> list = new ArrayList<>();
        for(int i =0;i< array.length;i++){
            list.add(array[i]);
        }
        return list;
    }
    public static List<String> getDirectoryContent(String path) {
        List<String> content = new ArrayList<>();
        File directory = new File(path);
        if (directory.isDirectory()) {//если дериктория
            String[] files = directory.list();
            if (files != null) {
                content = MassToList.masstolist(files);
            }
        }
        return content;
    }

    public static void main(String[] args) {
        String directoryPath = "D:\\Учеба\\2 курс\\1 сем\\Архитектура мобилок\\Отчет6";
        List<String> directoryContent = getDirectoryContent(directoryPath);
        for (int i = 0; i < Math.min(5, directoryContent.size()); i++) {
            System.out.println(directoryContent.get(i));
        }
    }
}

