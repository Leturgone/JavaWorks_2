package Work23.work202;

import Work23.work201.ArrayQueue;

import java.util.LinkedList;

public class LinkedQueue extends AbstractQueue {
    private LinkedList<Object> q;
    public LinkedQueue(){
        q = new LinkedList<>();
        head = tail = 0;
    }

    @Override
    public Object dequeue() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  q.remove(head);
    }

    @Override
    public Object element() {
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty!");
        return  q.get(head);     }

    @Override
    public void enqueue(Object o) {
        q.add(o);
        tail++;
    }

    @Override
    public boolean isEmpty() {
        return tail == head;
    }

    @Override
    public boolean clear() {
        boolean r = ! isEmpty();
        q.clear();
        head = tail = 0;
        return r;
    }
    public static void main(String[] args) {
        LinkedQueue aqm=new LinkedQueue();
        aqm.enqueue("Text1");
        aqm.enqueue("Text2");
        aqm.enqueue("Text3");
        System.out.println(aqm.isEmpty());
        aqm.clear();
        System.out.println(aqm.isEmpty());
    }
}
