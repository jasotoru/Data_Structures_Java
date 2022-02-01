package queue;

public class Main {

    public static void main(String[] args) {

        QueueDemo<Integer> qd = new QueueDemo<>();

        System.out.println("Is empty? " + qd.isEmpty());
        System.out.println("=================================");

        qd.insert(1);
        qd.insert(2);
        qd.insert(3);
        qd.insert(4);
        qd.insert(5);

        System.out.println(qd);
        System.out.println("Size: " + qd.size());
        System.out.println("Is empty? " + qd.isEmpty());
        System.out.println("=================================");

        System.out.println("Delete element: " + qd.get());
        qd.delete();

        System.out.println("Delete element: " + qd.get());
        qd.delete();

        System.out.println("Delete element: " + qd.get());
        qd.delete();

        System.out.println(qd);
        System.out.println("Size: " + qd.size());
        System.out.println("=================================");

        qd.insert(1001);
        System.out.println("Add element " + qd.getLast());
        qd.insert(1002);
        System.out.println("Add element " + qd.getLast());
        System.out.println(qd);
        System.out.println("Size: " + qd.size());
        System.out.println("=================================");

        System.out.println("Delete element: " + qd.get());
        qd.delete();
        System.out.println(qd);
        System.out.println("Size: " + qd.size());
        System.out.println("=================================");
    }
}
