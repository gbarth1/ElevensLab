package com.company;

/**
 * Created by gb647 on 3/16/17.
 */
public class DeckTester {

    public static void main(String[] args) {
        String [] r1 = {"2", "3", "4"};
        String [] s1 = {"Hearts", "Clubs", "Diamonds"};
        int [] p1 = {2, 3, 4};

        String [] r2 = {"6", "7", "8"};
        String [] s2 = {"Spades", "Diamonds", "Diamonds"};
        int [] p2 = {6, 7, 8};

        Deck deck1 = new Deck (r1, s1, p1);
        Deck deck3 = new Deck (r2, s2, p2);
    }
}
