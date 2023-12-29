package Work9.work789;

public class Magazine implements Printable {
    private String title;
    public Magazine(String title) {
        this.title = title;
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                Magazine magazine = (Magazine) item;
                System.out.println(magazine.getName());
            }
        }
    }
    public String getName() {
        return this.title;
    }
    public static void main(String[] args){
        Printable[] magazines = new Printable[3];
        magazines[0] = new Magazine("Magazine 1");
        magazines[1] = new Book("Book 1");
        magazines[2] = new Magazine("Magazine 2");
        printMagazines(magazines);
    }
    @Override
    public void print() {
        System.out.printf(title);
    }
}
