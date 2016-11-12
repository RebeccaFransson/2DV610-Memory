package main;

import java.util.ArrayList;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Deck {
    private int maxCards;
    private ArrayList<Character> alphabet = new ArrayList<Character>();
    private ArrayList<Card> cards = new ArrayList<Card>(maxCards);

    public Deck(int maxCards) {
        this.maxCards = maxCards;
        setAlphabet();
        createCards();
    }

    private void createCards() {
        for (int i = 0; i < this.maxCards; i++){
            if(i < maxCards/2){
                createCardsFirstHalf();
            }else{
                createCardsSecondHalf();
            }
        }
    }

    private void createCardsFirstHalf() {
    }
    private void createCardsSecondHalf() {
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

    public ArrayList<Card> getDeck() {
        return this.cards;
    }
}
