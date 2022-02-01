package linkedList;

public class Main {

    public static void main(String[] args) {

        LinkedListDemo<Integer> list = new LinkedListDemo<>();

        System.out.println("Is empty? " + list.isEmpty() + "\n");

        list.insertFirst(52);
        list.insertLast(48);
        list.insertAfterPos(0, 95);
        list.insertAfterPos(1, 9);
        list.insertAfterPos(2, 6);
        list.insertLast(100);

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Is empty? " + list.isEmpty() + "\n");
        System.out.println("=======================================");

        list.deleteFirst();
        System.out.println(list);
        System.out.println("Size: " + list.size() + "\n");
        System.out.println("=======================================");
        
        list.deleteLast();
        System.out.println(list);
        System.out.println("Size: " + list.size() + "\n");
        System.out.println("=======================================");

        list.deletePosition(1);
        System.out.println(list);
        System.out.println("Size: " + list.size() + "\n");
    }
}
