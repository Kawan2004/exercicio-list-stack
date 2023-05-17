package deck;
import card.MagicCard;
import card.TypeSkill;

public class Deck {
    LinkedList list = new LinkedList();
    
    public void push (MagicCard card) {
        if (card.getType() == TypeSkill.GROUND){
            if (list.isEmpty()) {
                list.add(card);
                return;
            }

            System.out.println("Impossivel adicionar essa carta");
        }

        else {
            list.add(card);
        }
    }

    public void pop() {
        list.pop();
    }

    public void clear () {
        list.clear();
    }

    public void remove (MagicCard card) {
        while (card.getName() != list.getTail().getValue().getName()){
            System.out.println(list.getTail().getValue().getName());

            if (card != list.getTail().getValue()) {
                list.pop();
            }
        
        }


    }

    @Override
    public String toString() {

        while (list.getTail() != null) {
            if (list.getTail() != null) {
                System.out.println(list.getTail().getValue().getName() + "\t" + list.getTail().getValue().getType() + "\t" + list.getTail().getValue().getEffect() + "\t" + list.getTail().getValue().getCost());
                list.pop();
            }
            
        }

        return list.getTail().getValue().getName() + "\t" + list.getTail().getValue().getType() + "\t" + list.getTail().getValue().getEffect() + "\t" + list.getTail().getValue().getCost();

    }


}
