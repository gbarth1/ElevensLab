package com.company;
import java.util.List;
import java.util.ArrayList;

public class Deck {


    private List<Card> cards;
    private int size;
    public Deck(String[] ranks, String[] suits, int[] values) {
		ArrayList<Card> list = new ArrayList();
        for(int i = 0; i<suits.length; i++) {
            for (int j = 0; j < ranks.length; j++){
                Card cool = new Card (ranks[j], suits[i], values[j]);
                deck.add(cool);
            }

        }
        deck = list;
        deckSize = deck.size();
    }

    private ArrayList<Card> deck;
    private int deckSize;

    public boolean isEmpty() {
		if(cards.size()>0){
            return false;
        }else{
            return true;
        }
    }

    public int size() {
		return size;
    }

    public void shuffle() {
        for (int i = deck.size() - 1; i > 0; i--) {
            int red = (int) (Math.random() * (i + 1));
            Card cool = deck.get(red);
            deck.set(i, cool);
            deck.set(red, deck.get(i));

        }
    }

    public Card deal() {
		return cards.get(size);
    }

    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}


