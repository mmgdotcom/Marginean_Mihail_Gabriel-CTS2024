package Composite;

public class Program {
    public static void main(String[] args) {
        // Composite Test
        Composite root = new Composite("root");
        Composite child1 = new Composite("child1");
        Composite child2 = new Composite("child2");

        root.add(new Leaf("Leaf A"));
        root.add(child1);
        child1.add(new Leaf("Leaf B"));
        child1.add(child2);
        child2.add(new Leaf("Leaf C"));

        root.operation();
    }
}
