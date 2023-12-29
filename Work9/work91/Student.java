package Work9.work91;

class Student {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }
    @Override
    public String toString() {
        return "Name "+this.name+" ID: "+this.iDNumber;
    }
}
