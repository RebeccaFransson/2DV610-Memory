package main;

import java.util.ArrayList;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Deck {
    private int maxCards;
    private ArrayList<Character> alphabet;

    public Deck(int maxCards) {
        this.maxCards = maxCards;
    }

    public int getMaxCards() {
        return maxCards;
    }

    public ArrayList<Character> getAlphabet() {
        return alphabet;
    }
}
