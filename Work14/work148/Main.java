package Work14.work148;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] array = new Object[]{"строка", "ворона", "вор"};
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                return ((String)o).contains("а");
            }
        };
        array = filter(array, filter);
        for (Object o : array) {
            System.out.println(o);
        }
    }
    public static Object[] filter(Object[] array, Filter filter) {
        return Arrays.stream(array)
                .filter(filter::apply)
                .toArray();
    }
}

