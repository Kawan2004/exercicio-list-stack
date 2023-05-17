package stack;

public class Stack<T> {

    private Node<T> first;

    // Methods

    public void push(T value) {

        Node<T> element = new Node<>(value);

        if (first == null) {
            first = element;
            return;
        }

        element.setNext(first);
        first = element;

    }

    public void pop(){

        if (this.first.getNext() != null) {
            this.first = this.first.getNext();
            return;
        }

        this.first = null;
    }

    public void pop(int value){

        if (value > 0 && value <= 16){
            for (int j = 0; j < value; j++) {
                this.pop();
            }
        }
    }

    public T peek () {
        
        if (this.first != null) {
         
            return this.first.getValue();
        }
        return null;
    }

    public boolean empty () {
        if (this.first == null) {
            return true;
        } 

        return false;
    }
}