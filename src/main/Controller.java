package main;

/**
 * Created by ymafr on 2016-11-15.
 */
public class Controller {
    private View view;

    public void setUp() {
        this.view = new View();
    }


    //public getters
    public View getView() {
        return this.view;
    }
}