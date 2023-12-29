package Work10.work101;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGPA(), s1.getGPA());
        //если меньше возварщает отрицательное
        //если больше возвращает положительное
        //иначе 0
    }
}
