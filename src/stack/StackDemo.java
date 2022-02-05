package stack;

public class StackDemo<T> {

    private Node<T> top;
    private int size = 0;

    private class Node<T> {

        public T t;
        public Node<T> next;

        public Node(T t) {
            this.t = t;
        }
    }

    public void push(T t) {
        Node<T> node = new Node(t);
        node.next = top;
        top = node;
        size++;
    }

    public void delete() {
        if (!isEmpty()) {
            Node<T> deleteNode = top;
            top = top.next;
            deleteNode.next = null;
            size--;
        }
    }

    public T get() {
        if (isEmpty()) {
            return null;
        } else {
            return top.t;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String string = "";
        if (isEmpty()) {
            return "Empty Stack";
        } else {
            System.out.println("Stack: ");
            Node<T> temp = top;
            while (temp != null) {
                string += temp.t + "\n";
                temp = temp.next;
            }
        }
        return string;
    }
}
