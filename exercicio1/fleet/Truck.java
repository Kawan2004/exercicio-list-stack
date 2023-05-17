package fleet;

public class Truck {

    private Delivery load;
    private Truck next;

    // Constructor

    public Truck (Delivery load) {
        this.load = load;
    }

    // Get

    public Delivery getLoad () {
        return this.load;
    }

    public Truck getNext () {
        return this.next;
    }

    // Set

    public void setLoad (Delivery load) {
        this.load = load;
    }

    public void setNext (Truck next) {
        this.next = next;
    }
}