package Work11;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;

    public Date getUserDate() {
        return userDate;
    }

    public void setUserDate(Date userDate) {
        this.userDate = userDate;
    }

    private Date userDate;
    private String surname;
    private String specialization;
    private int curse;
    private double GPA;
    private String group;

    public Student(String name, String surname, String specialization, int curse, String group, double GPA, Date userDate) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.curse = curse;
        this.group = group;
        this.GPA = GPA;
        this.userDate = userDate;
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

    @Override
    public String toString() {
        return name + " " + surname + " " + specialization + " curse=" + curse + ", GPA=" + GPA + ", group='" + group;
    }

    public String toString(String dateFormat) {
        if (Objects.equals(dateFormat, "long")) {
            dateFormat = "E dd.MM.yyyy 'at' hh:mm:ss a zzz";
        }
        if (Objects.equals(dateFormat, "middle")) {
            dateFormat = "E dd.MM.yyyy";
        }
        if (Objects.equals(dateFormat, "short")) {
            dateFormat = "dd'/'MM'/'yy";
        }
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        return "Имя: " + name + " Дата рождения: " + formatter.format(userDate);
    }

    public static void main(String[] args) {
        Date dateOfBirth = new Date(2004-1900, 4, 21); // Replace with the actual date of birth
        Student student = new Student("Fedor", "Yasnecov", "Programmer", 2, "IKBO-07-22", 4.5, dateOfBirth);


        System.out.println(student.toString());
        System.out.println(student.toString("long"));
        System.out.println(student.toString("middle"));
        System.out.println(student.toString("short"));
    }
}

