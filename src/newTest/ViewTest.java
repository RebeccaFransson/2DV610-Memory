package newTest;

import newMain.View;
import org.junit.Assert;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by ymafr on 2016-11-16.
 */
public class ViewTest {

    private View view;

    @Test
    public void testPrintStart(){
        System.out.println("testStart()");
        PrintStream ps = mock(PrintStream.class);
        view = new View(ps);

        view.printStart();

        verify(ps).println(view.START);
    }

}