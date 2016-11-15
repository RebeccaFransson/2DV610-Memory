package test;

import main.Card;
import main.Deck;
import main.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ymafr on 2016-11-14.
 */
public class ViewTest {

    @Before
    public void beforeTest(){
        System.out.print("-- View class - ");
    }

    @Test
    public void testStartView(){
        System.out.println("testStartView()");
        View view = new View();
        String expected = "Let's start! \nPick a even number between 2 and 40:";
        view.start();
        String actual = view.getStringBuffer();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPrintDeck(){
        System.out.println("testPrintDeck()");
        /*View view = new View();
        Deck mockedDeck = mock(Deck.class);
        view.printDeck(mockedDeck);
        Assert.assertEquals("the whole deck", view.getStringBuffer());
        System.out.println(view.getStringBuffer());
        */
        View mockedView = mock(View.class);
        Deck mockedDeck = mock(Deck.class);
        mockedView.printDeck(mockedDeck);
        when(mockedView.printDeck(mockedDeck)).thenReturn("the whole deck");
        Assert.assertEquals("the whole deck", mockedView.printDeck(mockedDeck));
    }

    @Test
    public void testCheckTwoShowNrs(){
        System.out.println("testCheckTwoShowNrs()");
        Card card = new Card('a', 0), card2 = new Card('a', 1);
        Deck mockedDeck = mock(Deck.class);
        View view = new View();

        when(mockedDeck.getCardFromShowNr(0)).thenReturn(card);
        when(mockedDeck.getCardFromShowNr(1)).thenReturn(card2);

        String actual = view.checkTwoShowNrs(mockedDeck, 0, 1);
        String expected = "a and a: Its the same, one point!";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCheckTwoShowNrsDifferentCards(){
        System.out.println("testCheckTwoShowNrsDifferentCards()");
        Card card = new Card('b', 0), card2 = new Card('a', 1);
        Deck mockedDeck = mock(Deck.class);
        View view = new View();

        when(mockedDeck.getCardFromShowNr(0)).thenReturn(card);
        when(mockedDeck.getCardFromShowNr(1)).thenReturn(card2);

        String actual = view.checkTwoShowNrs(mockedDeck, 0, 1);
        String expected = "a and a: Its the same, one point!";

        Assert.assertEquals(expected, actual);
    }

}