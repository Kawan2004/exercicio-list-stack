package stack;
public class Stack<T> {
    
    private Node<T> top;

    // Method push - add an element at the top;

    public void push (T element) {

        Node<T> cell = new Node<>(element);

        if (this.top == null) {
            this.top = cell;
            return;
        }

        cell.setNext(this.top);
        this.top = cell;

    }

    // Method pop - remove the top element;

    public Node<T> pop () {
        if (this.top != null) {
            return this.top = top.getNext();
        }
            return null;
        
    }

    // returns wheter the stack is empty or not;

    public boolean empty () {
        if (this.top == null){
            return true;
        }

        return false;
    }


    // Method peek - returns the last element of the list;

    public Node<T> peek () {
        return this.top;
    }

}
