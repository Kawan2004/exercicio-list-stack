package fleet;
import stack.Stack;

public class Fleet {

    private Truck firstTruck;
    private Truck lastTruck;
    private int size;

    private Stack<Truck> stack = new Stack<>();

    // Methods

    public void newTruck (Delivery element) {
        
        Truck truck = new Truck (element);

        if (firstTruck == null && lastTruck == null) {
            this.firstTruck = truck;
            this.lastTruck = truck;
            this.size++;
            return;
        }

        this.lastTruck.setNext(truck);
        this.lastTruck = truck;
        this.size++;

    }

    public void displayOrder () {
        
        Truck assistant = this.firstTruck;
        
        for (int j = 0; j < this.size; j++) {
            if (assistant.getLoad() == Delivery.OUTRO) {
                stack.push(assistant);
            }
            assistant = assistant.getNext();
        }

        assistant = this.firstTruck;

        for(int j = 0; j < this.size; j++) {
            if (assistant.getLoad() == Delivery.PERECIVEL) {
                stack.push(assistant);
            }
            assistant = assistant.getNext();
        }

        

        for (int j = 0; j < this.size - 1; j++) {

            System.out.println(this.stack.peek().getValue().getLoad().getValue());
            stack.pop();
            
        }


    }

}