package queue;

public class QueueDemo<T> {

    private Node<T> head;
    private Node<T> last;
    private int size = 0;

    private class Node<T> {

        public T t;
        public Node<T> next;

        public Node(T t) {
            this.t = t;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void insert(T t) {
        Node<T> node = new Node(t);
        if (isEmpty()) {
            head = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    public void delete() {
        if (!isEmpty()) {
            Node<T> node = head;
            head = head.next;
            node.next = null;
            if (isEmpty()) {
                last = null;
            }
            size--;
        }
    }

    public T get() {
        if (isEmpty()) {
            return null;
        } else {
            return head.t;
        }
    }
    
    public T getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return last.t;
        }
    }

    @Override
    public String toString() {
        String string = "";
        if (isEmpty()) {
            return "Empty List";
        } else {
            Node<T> temp = head;
            System.out.println("Queue: ");
            while (temp != null) {
                string += temp.t + "\n";
                temp = temp.next;
            }
            return string;
        }
    }
}
