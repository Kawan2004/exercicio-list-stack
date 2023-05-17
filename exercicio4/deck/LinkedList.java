package deck;
import card.MagicCard;

public class LinkedList {
    private Node head;
    private Node tail;
    public int size;

    public void setTail (Node tail) {
        this.tail = tail;
    }

    public void add (MagicCard element) {
        Node node = new Node(element);

        if (head == null && tail == null) {
            head = node;
            tail = node;
            size++;
            return;
        }

        this.tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
        size++;
    }

    public Node top () {
        return this.tail;
    }

    public void pop () {
        tail = tail.getPrevious();
        size--;
    }

    public void clear () {
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public Node getTail () {
        return this.tail;
    }

    public boolean isEmpty () {
        if (head == null && tail == null) {
            return true;
        }

        return false;
    }

}
