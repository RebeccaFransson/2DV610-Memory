package main;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Card {
    private char letter;
    private int shownr;

    public Card(char letter, int id) {
        this.letter = letter;
        this.shownr = id;
    }

    public char getLetter(){
        return this.letter;
    }
    public int getShowNr(){
        return this.shownr;
    }
}
