package Work7.work74;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.getReal();
        double newImaginary = this.imaginary + other.getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.getReal() - this.imaginary * other.getImaginary();
        double newImaginary = this.real * other.getImaginary() + this.imaginary * other.getReal();
        return new ComplexNumber(newReal, newImaginary);
    }

    // Other methods and operations can be implemented here

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

