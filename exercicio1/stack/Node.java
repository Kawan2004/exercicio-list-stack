package stack;
public class Node<T> {
    
    private T value;
    private Node<T> next;

    // Constructor

    public Node (T value) {
        this.value = value;
        this.next = null;
    }

    // Get

    public T getValue () {
        return this.value;
    }

    public Node<T> getNext (){
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
