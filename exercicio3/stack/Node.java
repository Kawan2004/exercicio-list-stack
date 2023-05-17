package stack;

import note.Note;

public class Node {

    private Note value;
    private Node next;

    // Constructor

    public Node (Note value) {
        this.value = value;
    }

    // Get

    public Note getValue () {
        return this.value;
    }

    public Node getNext () {
        return this.next;
    }

    // Set
    
    public void setValue (Note value) {
        this.value = value;
    }

    public void setNext (Node next) {
        this.next = next;
    }

}