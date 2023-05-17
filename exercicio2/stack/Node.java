package stack;

public class Node<T> {
    
    private T value;
    private Node<T> next;

    // Construct

    public Node (T value) {
        this.value = value;
    }

    // Get

    public T getValue () {
        return this.value;
    }

    public Node<T> getNext () {
        return this.next;
    }

    // Set

    public void setValue (T value) {
        this.value = value;
    }

    public void setNext (Node<T> next) {
        this.next = next;
    }
}
