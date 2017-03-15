package com.company;

/**
 * Created by gb647 on 3/15/17.
 */
public class Card {

    private String suit;
    private String rank;
    private int pointValue;

    public Card(String cardRank, String cardSuit, int cardPointValue) {
		String drac[][] = new String[1][3];
        
    }


    /**
     * Accesses this <code>Card's</code> suit.
     * @return this <code>Card's</code> suit.
     */
    public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }

    /**
     * Accesses this <code>Card's</code> rank.
     * @return this <code>Card's</code> rank.
     */
    public String rank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }

    /**
     * Accesses this <code>Card's</code> point value.
     * @return this <code>Card's</code> point value.
     */
    public int pointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }

    /**
     * Converts the rank, suit, and point value into a string in the format
     *     "[Rank] of [Suit] (point value = [PointValue])".
     * This provides a useful way of printing the contents
     * of a <code>Deck</code> in an easily readable format or performing
     * other similar functions.
     *
     * @return a <code>String</code> containing the rank, suit,
     *         and point value of the card.
     */
    @Override
    public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
    }
}
