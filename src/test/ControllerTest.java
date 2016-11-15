package test;

import main.Controller;
import main.Deck;
import main.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ymafr on 2016-11-15.
 */
public class ControllerTest {
    @Before
    public void setUp() { System.out.print("-- Controller class - "); }

    @Test
    public void testSetUpView(){
        System.out.println("testSetUpView();");
        Controller ctrl = new Controller();

        View view = ctrl.getView();
        Assert.assertNotNull(view);
    }
    @Test
    public void testSetUpDeck(){
        System.out.println("testSetUpDeck();");
        Controller ctrl = new Controller();

        Deck deck = ctrl.getDeck();
        Assert.assertNotNull(deck);
    }

}