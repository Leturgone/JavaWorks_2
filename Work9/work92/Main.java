package Work9.work92;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 3.8),
                new Student("Emily", 3.5),
                new Student("Michael", 3.2),
                new Student("Sophia", 3.9),
                new Student("Daniel", 3.7)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.QuickSort(students, 0, students.length -1);

        System.out.println("\\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
