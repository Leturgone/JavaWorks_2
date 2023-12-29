package Work20.work205;

public class Matrix<T extends Number> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }
    public Matrix<T> add(Matrix<T> other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры");
        }

        Double[][] result = new Double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = data[i][j].doubleValue() + other.data[i][j].doubleValue();
            }
        }
        Matrix<T> M= (Matrix<T>) new Matrix<>(result);
        return M;
    }
    public Matrix<T> sub(Matrix<T> other) {
        if (data.length != other.data.length || data[0].length != other.data[0].length) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры");
        }

        Double[][] result = new Double[data.length][data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                result[i][j] = data[i][j].doubleValue() - other.data[i][j].doubleValue();
            }
        }
        Matrix<T> M= (Matrix<T>) new Matrix<>(result);
        return M;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (data[0].length != other.data.length) {
            throw new IllegalArgumentException("Количество столбцов в первой матрице должно соответствовать количеству строк во второй матрице");
        }

        Double[][] result = new Double[data.length][other.data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < other.data[0].length; j++) {
                result[i][j] = 0.0; // Инициализация элемента нулевым значением
                for (int k = 0; k < data[0].length; k++) {
                    result[i][j] += data[i][k].doubleValue() * other.data[k][j].doubleValue();
                }
            }
        }
        Matrix<T> M= (Matrix<T>) new Matrix<>(result);
        return M;
    }
        public void print() {
        for (int i = 0; i < data[0].length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Integer[][] data2 = {{5, 6}, {7, 8}};

        Matrix<Integer> matrix1 = new Matrix<>(data1);
        Matrix<Integer> matrix2 = new Matrix<>(data2);
        System.out.println("Матрицa 1:");
        matrix1.print();
        System.out.println("Матрицa 2:");
        matrix2.print();
        Matrix<Integer> sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();
        Matrix<Integer> sub = matrix1.sub(matrix2);
        System.out.println("Разность матриц:");
        sub.print();
        Matrix<Integer> product = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        product.print();
    }
}


