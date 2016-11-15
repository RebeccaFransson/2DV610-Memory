package main;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ymafr on 2016-11-12.
 */
public class Deck {
    private int maxCards;
    private int turns;
    private ArrayList<Character> alphabet = new ArrayList<Character>();
    private ArrayList<Character> alphabetDuplicated = new ArrayList<Character>();//For the tests
    private ArrayList<Character> usedLetters = new ArrayList<Character>();
    public ArrayList<Card> cards = new ArrayList<Card>(maxCards);

    private Random rand;

    public Deck(int maxCards) {
        if(maxCards%2 != 0){
            throw new IllegalArgumentException("Needs to be odd max number of cards");
        }else if(maxCards < 0 || maxCards > 40){
            throw new IllegalArgumentException("Needs to be between 2 and 40");
        }
        this.maxCards = maxCards;
        this.turns = 0;
        setAlphabet();
        createCards();
    }

    private void createCards() {
        for (int i = 0; i < this.maxCards; i++){
            if(i < maxCards/2){
                createCardsPartTwo(this.alphabet, i);
            }else{
                createCardsPartTwo(this.usedLetters, i);
            }
        }
    }

    //Takes first a letter from the alphabet
    //Adds the letter to the usedletters array if its the first part of the maxCards
    private void createCardsPartTwo(ArrayList<Character> list, int i) {
        int id = getRandomIndex(list);

        char letter = list.get(id);
        list.remove(id);
        if(i < maxCards/2){
            this.usedLetters.add(letter);
        }

        addCard(new Card(letter, i+1));
    }

    public boolean canGuess() {
        return this.cards.size() != 0;
    }



    //Public getters
    public int getMaxCards() {
        return this.maxCards;
    }

    public ArrayList<Character> getWholeAlphabet() {
        return this.alphabetDuplicated;
    }

    public Card getCardWithIndex(int index){
        return this.cards.get(index);
    }

    public ArrayList<Card> getDeck() {
        return this.cards;
    }

    public Card getCardFromShowNr(int showNr) {
        //Can be made faster with hashset
        Card returnCard = null;
        for (Card c : getDeck())
            if (c.getShowNr() == showNr) returnCard = c;

        if (returnCard == null)
            throw new NullPointerException("Sorry, this nr is not in the deck.");

        return returnCard;
    }





    //Public setters
    public Card addCard(Card newCard){
        this.cards.add(newCard);
        return newCard;
    }
    public Card removeCard(Card card){
        this.cards.remove(card);
        return card;
    }
    public void addTurn(){
        this.turns++;
    }

    //Public getters
    public int getTurns(){
        return this.turns;
    }



    //Private getters
    private int getRandomIndex(ArrayList<Character> list) {
        rand = new Random();
        int randomNum = rand.nextInt(list.size());
        return randomNum;
    }


    //Private setters
    private void setAlphabet(){
        for (char c = 'a'; c <= 'z'; c++){
            this.alphabet.add(c);
            this.alphabetDuplicated.add(c);
        }

    }



}
