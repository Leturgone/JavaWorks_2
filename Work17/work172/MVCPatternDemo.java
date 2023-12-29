package Work17.work172;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Employee model = retriveCourseFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);
        controller.updateView();
//update model data
        controller.setWages("90000000000000000000$");
        System.out.println("After updating, Employee Details are as follows");
                controller.updateView();
    }
    private static Employee retriveCourseFromDatabase(){
        Employee student = new Employee();
        student.setWages("8000000$");
        student.setName("Rayan Gosling");
        return student;
    }
}
