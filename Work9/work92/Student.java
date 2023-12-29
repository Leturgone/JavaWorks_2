package Work9.work92;

class Student {
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA= GPA;
    }

    public double getGPA() {
        return GPA;
    }
    @Override
    public String toString() {
        return "Name "+this.name+" GBA: "+this.GPA;
    }
}
