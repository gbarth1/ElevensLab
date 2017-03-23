package com.company;
import java.util.List;
import java.util.ArrayList;

public class Deck {


    private List<Card> cards;
    private int size;
    public Deck(String[] ranks, String[] suits, int[] values) {
		List cards = new ArrayList(size);
        cards.add(ranks);
        cards.add(suits);
        cards.add(values);
    }

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

    }

    public Card deal() {
		return cards.get(size);
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
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


