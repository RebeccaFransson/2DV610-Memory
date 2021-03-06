package test;

import main.Card;
import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

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

    @Test//DOOVER
    public void testAddCardsWithMock(){
        System.out.println("testAddCardsWithMock()");
        //Create mock of deck
        //Create cards
        //See if it is the same cards
        Deck mockedDeck = mock(Deck.class);
        Card card = new Card('a', 1);
        Card card2 = new Card('a', 1);
        when(mockedDeck.addCard(card)).thenReturn(card);
        when(mockedDeck.getCardWithIndex(0)).thenReturn(card);

        when(mockedDeck.addCard(card2)).thenReturn(card2);
        when(mockedDeck.getCardWithIndex(1)).thenReturn(card2);

        Assert.assertEquals(mockedDeck.getCardWithIndex(0), card);
        Assert.assertEquals(mockedDeck.getCardWithIndex(1), card2);
    }

    @Test
    public void testRemoveCards(){
        System.out.println("testRemoveCards()");
        Deck deck = new Deck(8);
        int before = deck.getDeck().size();
        deck.removeCard(deck.getDeck().get(0));
        int after = deck.getDeck().size();

        Assert.assertNotEquals(before, after);
    }

    @Test//DOOVER
    public void testCanGuessWithMock(){
        System.out.println("testCanGuessWithMock()");
        Deck mockedDeck = mock(Deck.class);
        when(mockedDeck.canGuess()).thenReturn(true);

        Assert.assertTrue(mockedDeck.canGuess());
    }

    @Test
    public void testCanGuess(){
        System.out.println("testCanGuess()");
        Deck deck = new Deck(2);
        //Can guess
        Assert.assertTrue(deck.canGuess());

        deck.removeCard(deck.getDeck().get(1));
        deck.removeCard(deck.getDeck().get(0));
        //Cannot guess
        Assert.assertFalse(deck.canGuess());
    }

    @Test//DOOVER
    public void testGetCardFromShowNr(){
        System.out.println("testGetCardFromShowNr()");
        Deck mockedDeck = mock(Deck.class);
        Card card = new Card('a', 1);
        when(mockedDeck.getCardFromShowNr(1)).thenReturn(card);
        Assert.assertEquals(card, mockedDeck.getCardFromShowNr(1));
    }

    @Test
    public void testGetCardFromWrongShowNr(){
        System.out.println("testGetCardFromWrongShowNr()");
        exception.expect(NullPointerException.class);
        Deck deck = new Deck(2);

        deck.getCardFromShowNr(24);//only shownrs as long as the alphabet
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
