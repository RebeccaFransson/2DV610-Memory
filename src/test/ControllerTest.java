package test;

import main.Controller;
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
    public void testSetUp(){
        System.out.println("testSetUp();");
        Controller ctrl = new Controller();
        ctrl.setUp();
        View view = ctrl.getView();
        Assert.assertNotNull(view);
    }

}