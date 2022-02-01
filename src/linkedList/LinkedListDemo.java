package linkedList;

public class LinkedListDemo<T> {

    private Node<T> head;
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

    public void insertFirst(T t) {
        Node<T> node = new Node(t);
        node.next = head;
        head = node;
        size++;
    }

    public void insertLast(T t) {
        Node<T> node = new Node(t);
        if (isEmpty()) {
            head = node;
        } else {
            Node<T> pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = node;
        }
        size++;
    }

    public void insertAfterPos(int index, T t) {
        Node<T> node = new Node<>(t);
        if (isEmpty()) {
            head = node;
        } else {
            Node<T> pointer = head;
            int count = 0;
            while (pointer.next != null && count < index) {
                pointer = pointer.next;
                count++;
            }
            node.next = pointer.next;
            pointer.next = node;
        }
        size++;
    }

    public T get(int index) {
        if (isEmpty()) {
            return null;
        } else {
            Node<T> pointer = head;
            int count = 0;
            while (pointer.next != null && count < index) {
                pointer = pointer.next;
                count++;
            }
            if (count != index) {
                return null;
            } else {
                return pointer.t;
            }
        }
    }

    public void deleteFirst() {
        if (!isEmpty()) {
            Node<T> first = head;
            head = head.next;
            first.next = null;
            size--;
        }
    }

    public void deleteLast() {
        if (!isEmpty()) {
            if (head.next == null) {
                head = null;
            } else {
                Node<T> pointer = head;
                while (pointer.next.next != null) {
                    pointer = pointer.next;
                }
                pointer.next = null;
                size--;
            }
        }
    }

    public void deletePosition(int index) {
        if (!isEmpty()) {
            if (index == 0) {
                deleteFirst();
            } else if (index < size) {
                Node<T> pointer = head;
                int count = 0;
                while (count < (index - 1)) {
                    pointer = pointer.next;
                    count++;
                }
                Node temp = pointer.next;
                pointer.next = temp.next;
                temp.next = null;
                size--;
            }
        }
    }

    @Override
    public String toString() {
        String string = "";
        if(isEmpty()) {
            return "Empty List";
        } else {
           Node<T> temp = head;
            System.out.println("List: ");
        while (temp != null) {
            string += temp.t + "\n";
            temp = temp.next;
        }
        return string; 
        }     
    }
}
