package test;

import main.Deck;
import main.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        View view = new View();
        Deck mockedDeck = mock(Deck.class);
        view.printDeck(mockedDeck);
        Assert.assertEquals("the whole deck", view.getStringBuffer());
    }

}