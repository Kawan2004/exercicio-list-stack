package deck;
import card.MagicCard;


public class Node {
    private MagicCard value;
    private Node next;
    private Node previous;

    public Node getPrevious () {
        return this.previous;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }

    public Node (MagicCard value) {
        this.value = value;
    }

    public MagicCard getValue () {
        return this.value;
    }

    public Node getNext () {
        return this.next;
    }

    public void setNext (Node next) {
        this.next = next;
    }
}
