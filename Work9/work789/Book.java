package Work9.work789;

public class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(book.getName());
            }
        }
    }

    public String getName() {
        return this.title;
    }

    public static void main(String[] args) {
        Printable[] books = new Printable[3];
        books[0] = new Magazine("Magazine 1");
        books[1] = new Book("Book 1");
        books[2] = new Magazine("Magazine 2");
        printBooks(books);
    }

    @Override
    public void print() {
        System.out.printf(title);
    }
}
