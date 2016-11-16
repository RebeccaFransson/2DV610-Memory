package newTest;

import newMain.Controller;
import newMain.View;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ymafr on 2016-11-16.
 */
public class ControllerTest {

    private Controller ctrl;

    @Before
    public void setUp(){
        System.out.println("Controller test - ");

    }

    @Test
    public void testStart(){
        System.out.println("testStart()");
        View view = mock(View.class);
        ctrl = new Controller(view);

        ctrl.run();

        verify(view).printStart();

    }




}