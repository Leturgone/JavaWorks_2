package Work24.work201;

public class Complex implements Numbers {
    private int image;

    private int real;
    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }
    public Complex() {
        this.real = 0;
        this.image = 0;
    }
    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", image=" + image +
                '}';
    }
}
