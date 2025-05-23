package Composite;

import java.util.ArrayList;
import java.util.List;

class Composite implements Component {
    private String name;
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        children.add(component);
    }

    public void operation() {
        System.out.println("Composite " + name + " is operating.");
        for (Component child : children) {
            child.operation();
        }
    }
}