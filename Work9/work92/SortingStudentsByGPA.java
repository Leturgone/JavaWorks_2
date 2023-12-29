package Work9.work92;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
        //если меньше возварщает отрицательное
        //если больше возвращает положительное
        //иначе 0
    }
    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
    public void QuickSort (Student[] students,int begin,int end){
        if (begin < end) {
            int pi = partition(students, begin, end);
            QuickSort(students, begin, pi - 1);
            QuickSort(students, pi + 1, end);
        }

    }
    private int partition(Student[] students,int begin,int end) {//разделение относительно стержная
        //Метод partition выбирает опорный элемент (в данном случае, последний элемент в массиве) и
        // переставляет элементы таким образом,
        // что все элементы, большие опорного, идут перед ним, а все элементы, меньшие опорного, идут после него.
        Student pivot = students[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (compare(students[j], pivot) > 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, end);
        return i + 1;
    }

}
