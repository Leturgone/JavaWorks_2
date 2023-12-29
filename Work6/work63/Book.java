package Work6.work63;

public class Book implements Nameable {
    private String name;
    public Book(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
}
