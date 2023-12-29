package Work11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Date;
public class ArrayListVSLinkedList {
    public static void main(String[] args) {
        ArrayList<String> A_list = new ArrayList<>();
        LinkedList<String> L_list = new LinkedList<>();

        //ДОБАВЛЕНИЕ
        long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            A_list.add("El "+i);
        }
        long end = System.nanoTime();
        long arrayListADDTime = (end- start);
        start = new Date().getTime();
        for (int i = 0; i < 100000; i++) {
            L_list.add("El "+i);
        }
        end = System.nanoTime();
        long linkedListADDTime = end- start;

        //ВСТАВКА
        start = System.nanoTime();
        for (int i =100; i < 200; i++) {
            A_list.add("El "+i);
        }
        end = System.nanoTime();
        long arrayListINSERTTime = end- start;
        start = System.nanoTime();
        for (int i = 100; i < 200; i++) {
            L_list.add("El "+i);
        }
        end = System.nanoTime();
        long linkedListINSERTTime = end- start;

        //ПОИСК
        start = System.nanoTime();
        A_list.contains("El 9999");
        end = System.nanoTime();
        long arrayListSEARCHTime = end- start;
        start = System.nanoTime();
        L_list.contains("El 9999");
        end = System.nanoTime();
        long linkedListSEARCHTime = end- start;

        //УДАЛЕНИЕ
        start = System.nanoTime();
        for (int i =A_list.size()-1; i>0; i--) {
            A_list.remove(i);
        }
        end = System.nanoTime();
        long arrayListDELETETime = end- start;
        start = System.nanoTime();
        for (int i =L_list.size()-1; i>0; i--) {
            L_list.remove(i);
        }
        end = System.nanoTime();
        long linkedListDELETETime= end- start;

        System.out.println("Время выполнения операции вставки в ArrayList: " + arrayListINSERTTime + " наносекунд");
        System.out.println("Время выполнения операции вставки в LinkedList: " + linkedListINSERTTime + " наносекунд");
        System.out.println("Время выполнения операции удаления из ArrayList: " + arrayListDELETETime + " наносекунд");
        System.out.println("Время выполнения операции удаления из LinkedList: " + linkedListDELETETime + " наносекунд");
        System.out.println("Время выполнения операции добавления в ArrayList: " + arrayListADDTime + " наносекунд");
        System.out.println("Время выполнения операции добавления в LinkedList: " + linkedListADDTime + " наносекунд");
        System.out.println("Время выполнения операции поиска в ArrayList: " + arrayListSEARCHTime + " наносекунд");
        System.out.println("Время выполнения операции поиска в LinkedList: " + linkedListSEARCHTime + " наносекунд");
    }
}
