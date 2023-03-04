public class Queue<T> {

    private LinkedList<T> list = new LinkedList<T>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void enqueue(T element) {
        list.addLast(element);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return list.removeFirst();
    }

    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("Очередь пуста");
        }
        return list.getFirst();
    }
}
