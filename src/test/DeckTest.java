package test;

import main.Card;
import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * Created by ymafr on 2016-11-12.
 */
public class DeckTest {
    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Before
    public void beforeTest(){
        System.out.print("-- Deck class - ");
    }

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

    @Test
    public void testRightCardsWithMock(){
        System.out.println("testRightCardsWithMock()");
        //Create mock of deck
        //Create cards
        //See if it is the same cards
        Deck mockedDeck = mock(Deck.class);
        Card card = mockedDeck.addCard('a', 1);
        Card card2 = mockedDeck.addCard('b', 2);
        Card card3 = mockedDeck.addCard('c', 3);

        Assert.assertEquals(mockedDeck.getCardWithIndex(0), card);
        Assert.assertEquals(mockedDeck.getCardWithIndex(1), card2);
        Assert.assertEquals(mockedDeck.getCardWithIndex(2), card3);
    }

    @Test
    public void testRemoveCards(){
        System.out.println("testRemoveCards()");
        Deck mockedDeck = mock(Deck.class);
        Card card = mockedDeck.addCard('a', 1);
        Card card2 = mockedDeck.addCard('b', 2);
        Card card3 = mockedDeck.addCard('c', 3);

        int before = mockedDeck.getDeck().size();
        mockedDeck.removeCard(card);
        int after = mockedDeck.getDeck().size();

        Assert.assertNotEquals(before, after);
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
