package Work19.work192;
import java.util.List;
import java.util.Scanner;
public class LabClassUI extends LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();

        labClass.addStudent(new Student("Marty", "Mcfly","Computer Science" , 2, "Group A", 2.0));

        labClass.addStudent(new Student("Patrick", "Bateman", "Engineering", 3, "Group B", 3.5));

        labClass.addStudent(new Student("Rayan", "Gosling", "Computer Science", 1, "Group A", 4.0));

        Scanner scanner = new Scanner(System.in);
        Scanner choiceScan = new Scanner(System.in);

        while (true) {
            System.out.println("----Меню выбора----\n" +
                    "1) Сортировка студентов по среднему баллу\n" +
                    "2) Поиск студента по имени\n" +
                    "3) Выход");
            try {
                switch (Integer.parseInt(choiceScan.nextLine())) {
                    case 1:
                        selectionSortByGPA(labClass.getStudents()); // Сортировка по среднему баллу
                        List<Student> sortedStudents = labClass.getStudents();
                        System.out.println("Сортировка по среднему баллу (GPA)");
                        for (Student student : sortedStudents) {
                            System.out.println(student);
                        }
                        break;

                    case 2:
                        System.out.print("Введите имя студента: ");
                        try {
                            String fullName = scanner.nextLine();
                            if (fullName.isEmpty()) {
                                throw new EmptyStringException("Ошибка при вводе");
                            }
                            // Поиск студента по ФИО
                            Student student = labClass.findStudentByName(fullName);
                            System.out.println("Найден студент " + student);
                        } catch (EmptyStringException e) {
                            System.out.println(e.getMessage());
                        } catch (StudentNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        return;
                }
            }catch (NumberFormatException e){
                System.out.println("Ошибка при вводе");
            }
        }
    }
}
