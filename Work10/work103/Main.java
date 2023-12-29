package Work10.work103;

public class Main {
    public static void main(String[] args) {
        Student[] merge_students;
        Student[] students = {
                new Student("John", 3.8),
                new Student("Emily", 3.5),
                new Student("Michael", 3.2),
                new Student("Sophia", 3.9),
        };
        Student[] students2 = {
                new Student("Mark", 4.8),
                new Student("Ben", 3.6),
                new Student("Peter", 5.0),
                new Student("Harry", 2.5)
        };

        System.out.println("Before sorting:");
        System.out.println("First mas: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Second mas: ");
        for (Student student : students2) {
            System.out.println(student);
        }
        MergeSort sorter = new MergeSort();
        //Сортируем массивы
        Student[] sort_students1=sorter.sort_Array(students);
        Student[] sort_students2=sorter.sort_Array(students2);
        //Объединяем массивы 1 отсортированный
        merge_students=sorter.Merge_Sort(sort_students1,sort_students2);

        System.out.println("\\nAfter sorting:");
        for (Student student : merge_students) {
            System.out.println(student);
        }
    }
}
