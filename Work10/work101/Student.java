package Work10.work101;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int curse;
    private double GPA;
    private String group;

    @Override
    public String toString() {
        return  name +" " +surname+ " " + specialization +" curse=" + curse + ", GPA=" + GPA + ", group='" + group;
    }

    public Student(String name, String surname, String specialization, int curse, String group, double GPA) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.curse = curse;
        this.group = group;
        this.GPA=GPA;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
