package Work19.work192;
import java.util.List;
public class LabClassDriver {
    public static void selectionSortByGPA(List<Student> students) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getGPA() < students.get(minIndex).getGPA()) {
                    minIndex = j;
                }
            }

            Student temp = students.get(i);
            students.set(i, students.get(minIndex));
            students.set(minIndex, temp);
        }
    }
    public static void findStudentByName(String name){

    }
}
