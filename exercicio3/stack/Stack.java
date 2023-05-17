package stack;
import note.Note;

public class Stack {

    private Node first;
    private int size;

    // Methods

    public void push (Note element) {
        Node cell = new Node(element);

        if (this.first == null) {
            this.first = cell;
            this.size++;
            return;
        }

        cell.setNext(this.first);
        this.first = cell;
        this.size++;
    }

    public void pop () {
        if (first.getNext() != null) {
            first = first.getNext();
        }
    }

    public Node peek () {
        return this.first;
    }

    public void displayStack () {
        

        for (int j = 0; j < this.size; j++) {
            System.out.println(peek().getValue().getName() + "\t" + peek().getValue().getFirstNote() + "\t" + peek().getValue().getSecondNote());
            this.pop();
        }
    }


}
