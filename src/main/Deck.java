package main;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Deck {
    private int maxCards;
    private ArrayList<Character> alphabet = new ArrayList<Character>();
    private ArrayList<Character> usedLetters = new ArrayList<Character>();
    private ArrayList<Card> cards = new ArrayList<Card>(maxCards);

    private Random rand;

    public Deck(int maxCards) {
        this.maxCards = maxCards;
        setAlphabet();
        createCards();
    }

    private void createCards() {
        for (int i = 0; i < this.maxCards; i++){
            if(i < maxCards/2){
                createCardsPartTwo(this.alphabet, true);
            }else{
                createCardsPartTwo(this.usedLetters, false);
            }
        }
    }

    //Takes first a letter from the alphabet
    //Adds the letter to the usedletters array if its the first part of the maxCards
    private void createCardsPartTwo(ArrayList<Character> list, boolean firstPart) {
        int id = getRandomIndex(list);

        char letter = list.get(id);
        list.remove(id);
        if(firstPart){
            this.usedLetters.add(letter);
        }

        Card newCard = new Card(letter, id);
        cards.add(newCard);
    }



    //Getters
    public int getMaxCards() {
        return this.maxCards;
    }

    public ArrayList<Character> getAlphabet() {
        return this.alphabet;
    }





    //Private getters
    private int getRandomIndex(ArrayList<Character> list) {
        rand = new Random();
        int randomNum = rand.nextInt(list.size());
        return randomNum;
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
