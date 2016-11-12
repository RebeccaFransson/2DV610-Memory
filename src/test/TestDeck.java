package test;

import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
}
