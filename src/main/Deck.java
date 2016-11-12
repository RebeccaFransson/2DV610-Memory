package main;

import java.util.ArrayList;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Deck {
    private int maxCards;
    private ArrayList<Character> alphabet = new ArrayList<Character>();

    public Deck(int maxCards) {
        this.maxCards = maxCards;
        setAlphabet();
    }

    //Getters
    public int getMaxCards() {
        return this.maxCards;
    }

    public ArrayList<Character> getAlphabet() {
        return this.alphabet;
    }


    //Private setters
    private void setAlphabet(){
        for (char c = 'a'; c <= 'z'; c++)
            this.alphabet.add(c);
    }
}
