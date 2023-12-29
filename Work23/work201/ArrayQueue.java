package Work23.work201;
import java.util.Arrays;
public class ArrayQueue {
    /* enqueue – добавить элемент в очередь;
 element – первый элемент в очереди;
 dequeue – удалить и вернуть первый элемент в очереди;
 size – текущий размер очереди;
 isEmpty – является ли очередь пустой;
 clear – удалить все элементы из очереди.
     */
    private static int size = 0;
    private static int start = 0;
    private static Object[] elements = new Object[2];

    /*
    Предусловие : element != null
    Постусловие: n == n'+1 && a[n] = element && forall i = 1..n': a[i] == a'[i]
     */
    public void enqueue(Object element) {//добавть элемент в очереди
        assert element != null;
        ensureCapacity(size + 1);
        elements[(start + size) % elements.length] = element;//Это добавляет новый элемент в конец очереди.ы
        size++;
    }

    private void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            Object[] elementsNew = new Object[capacity*2];
            if (start + size <= elements.length) {
                System.arraycopy(elements, start,
                        elementsNew, 0, size);
            } else {
                System.arraycopy(elements, start,
                        elementsNew, 0, elements.length - start);
                System.arraycopy(elements, 0,
                        elementsNew, elements.length - start, (start + size) % elements.length);
            }
            elements = elementsNew;
            start = 0;
        }
    }

    /*
    Pred: true
    Post: n == n' && forall i = 1..n: a[i] == a'[i] && R = (Array) queue
     */
    public Object[] toArray() {
        Object[] elementsNew = new Object[size];
        System.arraycopy(elements, 0, elementsNew, 0, size);
        return elementsNew;
    }

    /*
    Pred: true
    Post: n == n' && forall i = 1..n: a[i] == a'[i] && R = (String) queue
     */
    public String toStr() {
        return Arrays.toString(toArray());
    }

    /*
    Pred: true
    Post: n == n' && forall i = 1..n': a[i] == a'[i] && R == a[1]
     */
    public Object element() {
        assert size > 0;
        return elements[start];
    }

    /*
    Pred: n > 0
    Post: n == n'-1 && forall i = 1..n: a[i] == a'[i + 1] && R == a[1]
     */
    public Object dequeue() {//удалть и вернуть первый элемент
        assert size > 0;
        Object result = elements[start];
        elements[start] = null;
        start = (start + 1) % elements.length;
        size--;
        return result;
    }

    /*
    Pred: true
    Post: n == n' && forall i = 1..n': a[i] == a'[i] && R == n
     */
    public int size() {
        return size;
    }

    /*
    Pred: true
    Post: n == n' && forall i = 1..n': a[i] == a'[i] && R == (n > 0)
     */
    public  boolean isEmpty() {
        return size == 0;
    }

    /*
    Pred: true
    Post: n == 0
     */
    public void clear() {
        elements = new Object[2];
        start = 0;
        size = 0;
    }
    public static void main(String[] args) {
        ArrayQueue aqm=new ArrayQueue();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.isEmpty());
        aqm.clear();
        System.out.println(aqm.isEmpty());
    }
}
