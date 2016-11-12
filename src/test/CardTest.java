package test;

import main.Card;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ymafr on 2016-11-12.
 */
public class CardTest {

    @Test
    public void testNewCard(){
        int showNr = 10;
        char letter = 'a';
        Card newCard = new Card(letter, showNr);

        Assert.assertEquals(newCard.getLetter(), letter);
        Assert.assertEquals(newCard.getShowNr(), letter);
    }
}