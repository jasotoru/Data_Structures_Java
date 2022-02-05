package stack;

public class Main {

    public static void main(String[] args) {

        StackDemo<Integer> stackDemo = new StackDemo<>();

        System.out.println("It's empty? " + stackDemo.isEmpty());
        System.out.println("======================================");

        stackDemo.push(1);
        stackDemo.push(2);
        stackDemo.push(3);
        stackDemo.push(4);
        stackDemo.push(5);

        System.out.println(stackDemo);
        System.out.println("It's empty? " + stackDemo.isEmpty());
        System.out.println("Size: " + stackDemo.size());
        System.out.println("First element: " + stackDemo.get());
        System.out.println("======================================");

        System.out.println("Deleting element...");
        stackDemo.delete();
        System.out.println(stackDemo);
        System.out.println("It's empty? " + stackDemo.isEmpty());
        System.out.println("Size: " + stackDemo.size());
        System.out.println("First element: " + stackDemo.get());
        System.out.println("======================================");

        System.out.println("Add element...");
        stackDemo.push(10);
        System.out.println(stackDemo);
        System.out.println("It's empty? " + stackDemo.isEmpty());
        System.out.println("Size: " + stackDemo.size());
        System.out.println("First element: " + stackDemo.get());
        System.out.println("======================================");
    }
}
