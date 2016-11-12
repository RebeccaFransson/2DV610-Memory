package test;

import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

/**
 * Created by ymafr on 2016-11-12.
 */
public class DeckTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void testMaxCards(){
        System.out.println("testMaxCards()");
        int expectedMaxCards = 10;
        Deck deck = new Deck(expectedMaxCards);

        Assert.assertEquals(deck.getMaxCards(), expectedMaxCards);
    }

    @Test
    public void testSetWholeAlphabet(){
        System.out.println("testSetWholeAlphabet()");
        Deck deck = new Deck(10);

        ArrayList<Character> expectedAlphabet = createAlphabet();

        Assert.assertEquals(deck.getWholeAlphabet(), expectedAlphabet);
    }

    @Test
    public void testCreateDeckOfCards(){
        System.out.println("testCreateDeckOfCards()");
        int expectedMaxCards = 10;
        Deck deck = new Deck(expectedMaxCards);

        Assert.assertEquals(deck.getMaxCards(), expectedMaxCards);
        Assert.assertEquals(deck.getDeck().size(), expectedMaxCards);
    }

    @Test
    public void testCreateDeckWithOddMaxCards(){
        System.out.println("testCreateDeckWithOddMaxCards()");
        exception.expect(IllegalArgumentException.class);
        Deck deck = new Deck(9);
    }



    //Help methods
    private ArrayList<Character> createAlphabet(){
        String letters = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Character> chars = new ArrayList<Character>();
        for (char c : letters.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }
}
