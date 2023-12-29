package Work20.work204;

public class MinMax<T extends Comparable<T>> {
    private T[] mass;

    public MinMax(T[] mass) {
        this.mass = mass;
    }

    public T Min() {
        if (mass == null || mass.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }
        T min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i].compareTo(min) < 0) {
                min = mass[i];
            }
        }
        return min;
    }

    public T Max() {
        if (mass == null || mass.length == 0) {
            throw new IllegalArgumentException("Массив пуст");
        }

        T max = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i].compareTo(max) > 0) {
                max = mass[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.Min());
        System.out.println("Max: " + intMinMax.Max());

        String[] StringArray = { "erre", "a", "rec", "zzzzzz" };
        MinMax<String> StringMinMax = new MinMax<>(StringArray);
        System.out.println("Min: " + StringMinMax.Min());
        System.out.println("Max: " + StringMinMax.Max());
    }
}
