package Work9.work93;
class Student implements Comparable<Student> {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public Student() {
    }
    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + " GPA: " + this.GPA;
    }
    @Override
    public int compareTo(Student other) {
        if (this.GPA < other.getGPA()) {
            return -1;
        } else if (this.GPA > other.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }
}