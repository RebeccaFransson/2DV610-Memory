package newTest;

import newMain.View;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by ymafr on 2016-11-16.
 */
public class ViewTest {

    private View view;

    @Test
    public void testPrintStart(){
        System.out.println("testStart()");

        view.printStart();

        Assert.assertEquals(view.getStringBuffer(), view.START);

    }

}