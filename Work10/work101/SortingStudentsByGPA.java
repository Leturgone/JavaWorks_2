package Work10.work101;


import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private Student[] iDNumber;
    public void setArray(Student[] students){
        this.iDNumber=students;
    }
    public void outArray(){
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    private void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
    public void QuickSort (Student[] students, int begin, int end,int order){
        if (begin < end) {
            int pi = partition(students, begin, end,order);
            QuickSort(students, begin, pi - 1,order);
            QuickSort(students, pi + 1, end,order);
        }

    }
    private int partition(Student[] students, int begin, int end,int order) {//разделение относительно стержная
        //Метод partition выбирает опорный элемент (в данном случае, последний элемент в массиве) и
        // переставляет элементы таким образом,
        // что все элементы, большие опорного, идут перед ним, а все элементы, меньшие опорного, идут после него.
        Comparator<Student> comp;
        if(order==1){
            comp = new StudentGPAComparator();
        }
        else{
            comp = new StudentCourseComparator();
        }
        Student pivot = students[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (comp.compare(students[j], pivot) < 0) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, end);
        return i + 1;
    }
    public static void main(String[] args) {
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        Student[] students = {
                new Student("John", "Lenon","music",2,"IKBO-07-23",3.3),
                new Student("Christofer", "Nolan","dirctor",4,"IKBO-70-96",5.0),
                new Student("Michael", "Scott","marketing",1,"IKBO-18-21",2.5),
                new Student("Elliot", "Anderson","Programmer",2,"IKBO-07-22",4.6)
        };
        sorter.setArray(students);
        System.out.println("До сортировки:");
        sorter.outArray();
        System.out.println("Выберите параметр по которому будем сортировать:\n 1 - Средний бал, 2 - Курс");
        Scanner console = new Scanner(System.in);
        int order = console.nextInt();
        sorter.QuickSort(sorter.iDNumber, 0, sorter.iDNumber.length -1,order);
        System.out.println("\nПосле сортировки:");
        sorter.outArray();
    }
}
