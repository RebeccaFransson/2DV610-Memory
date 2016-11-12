package test;

import main.Card;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by ymafr on 2016-11-12.
 */
public class CardTest {
    @Before
    public void beforeTest(){
        System.out.println("--Testing Card class--");
    }

    @Test
    public void testNewCard(){
        System.out.println("testNewCard()");
        int showNr = 10;
        char letter = 'a';
        Card newCard = new Card(letter, showNr);

        Assert.assertEquals(newCard.getLetter(), letter);
        Assert.assertEquals(newCard.getShowNr(), showNr);
    }

}