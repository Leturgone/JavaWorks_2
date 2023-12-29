package Work21.work203;

public class ManyTypeMass<T> {
    private T[] array;

    public ManyTypeMass(int size) {
        //Поскольку в Java нельзя создать массивы обобщенных типов из-за стирания типов, мы создаем новый массив объектов типа `Object` с помощью выражения `new Object[size]`.
        // Затем мы приводим его к типу `T[]` с помощью оператора приведения типа `(T[])`.
         array = (T[]) new Object[size];
        //Object - это класс в языке Java, от которого наследуются все остальные классы. Он является верхним классом
        // в иерархии классов Java и предоставляет базовые методы и функциональность,
        // которые доступны для всех объектов в Java.
    }

    public void setElement(int index, T element) {
        array[index] = element;
    }

    public T getElement(int index) {
        return array[index];
    }
    public static void main(String[] args) {
        ManyTypeMass<Integer> intArray = new ManyTypeMass<>(5);
        intArray.setElement(0, 1);
        intArray.setElement(1, 2);
        intArray.setElement(2, 3);

        ManyTypeMass<String> stringArray = new ManyTypeMass<>(3);
        stringArray.setElement(0, "I am");
        stringArray.setElement(1, "String Array");

        System.out.println("Integer Array: " + intArray.getElement(0) + ", " + intArray.getElement(1) + ", " + intArray.getElement(2));
        System.out.println("String Array: " + stringArray.getElement(0) +" "+ stringArray.getElement(1));
        System.out.println("String Array el: " + stringArray.getElement(0) +" "+ stringArray.getElement(1));

    }
}
