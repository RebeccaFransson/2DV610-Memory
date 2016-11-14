package test;

import main.View;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
        View view = new View();
        String expected = "Welcome";
        view.start();
        String actual = view.getStringBuffer();
        Assert.assertEquals(expected, actual);
    }

}