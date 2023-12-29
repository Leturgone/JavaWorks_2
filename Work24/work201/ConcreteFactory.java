package Work24.work201;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Numbers сreateСomplex() {
        return new Complex();
    }

    @Override
    public Numbers CreateCompex(int real, int image) {
        return new Complex(real,image);
    }

    @Override
    public Numbers CreateNatural(int real) {
        return new Nutural(real);
    }

    @Override
    public Numbers CreateNatural() {
        return new Nutural();
    }
}
