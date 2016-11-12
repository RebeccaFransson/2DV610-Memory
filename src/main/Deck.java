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

    //Takes first letter from the alphabet
    //Adds the letter to the usedletters array
    private void createCardsFirstHalf() {
        Random rand = new Random();
        int id = rand.nextInt(alphabet.size());

        char letter = this.alphabet.get(id);
        this.usedLetters.add(letter);
        this.alphabet.remove(id);

        Card newCard = new Card(letter, id);
        cards.add(newCard);
    }
    //When half of the maxCards has gone then take from the used letters insted
    private void createCardsSecondHalf() {
        Random rand = new Random();
        int id = rand.nextInt(usedLetters.size());

        char letter = this.usedLetters.get(id);
        this.usedLetters.remove(id);

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


    //Private setters
    private void setAlphabet(){
        for (char c = 'a'; c <= 'z'; c++)
            this.alphabet.add(c);
    }

    public ArrayList<Card> getDeck() {
        return this.cards;
    }
}
