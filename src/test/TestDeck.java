package test;

import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ymafr on 2016-11-12.
 */
public class TestDeck {

    @Before
    public void beforeTest(){
        System.out.println("--Testing Deck class--");
    }

    @Test
    public void testMaxCards(){
        System.out.println("testMaxCards()");
        int expectedMaxCards = 10;
        Deck deck = new Deck(expectedMaxCards);

        Assert.assertEquals(deck.getMaxCards(), expectedMaxCards);
    }

    @Test
    public void testSetAlphabet(){
        System.out.println("testSetAlphabet()");
        Deck deck = new Deck(10);

        ArrayList<Character> expectedAlphabet = createAlphabet();


        Assert.assertEquals(deck.getAlphabet(), expectedAlphabet);
    }



    //Help methods
    private ArrayList<Character> createAlphabet(){
        String letters = "abcdefghijklmnopqrstvuwz";
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : letters.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }
}
