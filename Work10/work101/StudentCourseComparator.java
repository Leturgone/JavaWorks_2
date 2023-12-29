package Work10.work101;

import java.util.Comparator;

public class StudentCourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getCurse(), s1.getCurse());
        //если меньше возварщает отрицательное
        //если больше возвращает положительное
        //иначе 0
    }
}
