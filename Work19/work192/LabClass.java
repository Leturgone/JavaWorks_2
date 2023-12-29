package Work19.work192;

import java.util.ArrayList;
import java.util.List;
public class LabClass {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findStudentByName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equals(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с именем " + fullName + " не найден");
    }

    public List<Student> getStudents() {
        return students;
    }
}
