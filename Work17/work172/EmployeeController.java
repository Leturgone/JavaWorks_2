package Work17.work172;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;
    public EmployeeController(Employee model, EmployeeView
            view){
        this.model = model;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setWages(String wages){
        model.setWages(wages);
    }
    public String getWages(){
        return model.getWages();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName(), model.getWages());
    }
}
