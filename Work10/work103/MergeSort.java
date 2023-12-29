package Work10.work103;

import java.util.ArrayList;
import java.util.List;
public class MergeSort  {

    public Student[] Merge_Sort(Student[] list1, Student[] list2){
        List<Student> merge_list = new ArrayList<>();
        int index1=0;
        int index2=0;

        while ((index1 < list1.length) && (index2 < list2.length)) {
            Student student1 = list1[index1];
            Student student2 = list2[index2];
            if (student1.compareTo(student2) > 0) {
                merge_list.add(student1);
                index1++;
            }
            else {
                merge_list.add(student2);
                index2++;
            }
        }
        while (index1 < list1.length) {
            merge_list.add(list1[index1]);
            index1++;
        }
        while (index2 < list2.length) {
            merge_list.add(list2[index2]);
            index2++;
        }
        return merge_list.toArray(new Student[]{});
    }
    public Student[] sort_Array(Student[] arrayA){ // сортировка Массива который передается в функцию
        // проверяем не нулевой ли он?
        if (arrayA == null) {
            return null;
        }
        // проверяем не 1 ли элемент в массиве?
        if (arrayA.length < 2) {
            return arrayA; // возврат в рекурсию
        }
        // копируем левую часть от начала до середины
        Student[] arrayB = new Student[arrayA.length / 2];
        System.arraycopy(arrayA, 0, arrayB, 0, arrayA.length / 2);

        // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        Student[] arrayC = new Student[arrayA.length - arrayA.length / 2];
        System.arraycopy(arrayA, arrayA.length / 2, arrayC, 0, arrayA.length - arrayA.length / 2);

        // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
        // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
        // точнее правую часть от него и опять вернет его назад
        arrayB = sort_Array(arrayB); // левая часть возврат из рекурсии строкой return arrayA;
        arrayC = sort_Array(arrayC); // правая часть возврат из рекурсии строкой return arrayA;

        // далее опять рекурсия возврата слияния двух отсортированных массивов
        return Merge_Sort(arrayB, arrayC);
    }
}
