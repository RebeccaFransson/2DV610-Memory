package test;

import main.Card;
import main.Deck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;


import static org.mockito.Mockito.*;

/**
 * Created by ymafr on 2016-11-12.
 */
@RunWith(MockitoJUnitRunner.class)
public class CardTest {

    @Before
    public void beforeTest(){
        System.out.print("-- Card class - ");
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
    public void testEqualLetters(){
        Card card = new Card('a', 1);
        Boolean actual = card.equals(new Card('a', 5));
        Assert.assertTrue(actual);
    }

}