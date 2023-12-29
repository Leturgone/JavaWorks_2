package Work17.work171;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveCourseFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
//update model data
        controller.setStudentName("Vitalik");
        System.out.println("nAfter updating, Course Details are as follows");
                controller.updateView();
    }
    private static Student retriveCourseFromDatabase(){
        Student student = new Student();
        student.setRollNo("IKBO-07-22");
        student.setName("Fedor");
        return student;
    }
}
