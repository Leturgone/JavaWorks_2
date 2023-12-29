package Work9.work91;

public class TestClass {
    public static void insertionSort(Student[] students)
    {
        for (int i = 1; i < students.length; i++) {
            Student current = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIDNumber() > current.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = current;
        }
    }
    public static void main(String[] args){
        Student[] Students= {
                new Student("Ivan", 123),
                new Student("Petr", 456),
                new Student("Vitalik", 789),
                new Student("Albina", 345)
        };
        insertionSort(Students);
        for(int i=0;i< Students.length;i++){
            System.out.println(Students[i]);
        }
    }

}
