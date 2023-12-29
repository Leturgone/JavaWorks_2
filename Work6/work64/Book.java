package Work6.work64;

public class Book implements Priceable {
    private int price;
    public Book(int price){
        this.price=price;
    }
    @Override
    public int getPrice() {
        return price;
    }
}
