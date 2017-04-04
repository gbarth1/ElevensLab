package com.company;

/**
 * Created by gracebarth on 4/4/17.
 */
public class ThirteensGUIRunner {
    /**
     * Plays the GUI version of Thirteens.
     * @param args is not used.
     */
    public static void main(String[] args) {
        Board board = new ThirteensBoard();
        CardGameGUI gui = new CardGameGUI(board);
        gui.displayGame();
    }
}
