package com.company;

/**
 * Created by gb647 on 3/15/17.
 */
public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
        suit=cardSuit;
        pointValue = cardPointValue;
        
    }

    public String suit() {
		return suit;
    }

    public String rank() {
		return rank;
    }

    public int pointValue() {
		return pointValue;
    }

    public boolean matches(Card otherCard) {
		if(otherCard.suit() == suit && otherCard.rank() == rank && otherCard.pointValue() == pointValue){
		    return true;
        } else
        {
            return false;
        }
    }

    public String toString() {
		String print = (rank + "of" + suit + "(point value =" + pointValue + ")");
        return print;
    }
}
