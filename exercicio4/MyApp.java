import deck.Deck;


import card.*;

public class MyApp {
    

    public static void main(String[] args) {
        
        Card [] card = new Card [10];

        card[0] = new Card("kawan", TypeSkill.ACTIVATED, 10, "Chute");
        card[1] = new Card("Terreno", TypeSkill.GROUND, 10, "terra");
        card[2] = new Card("Raio", TypeSkill.ENCHANTMENT, 10, "choque");

        Deck deck = new Deck();
        deck.push(card[1]);
        deck.push(card[0]);
        deck.push(card[2]);

        deck.remove(card[1]);

        System.out.println(deck);



        

        

    }
}
