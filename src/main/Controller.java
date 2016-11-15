package main;

/**
 * Created by ymafr on 2016-11-15.
 */
public class Controller {
    private View view;
    private Deck deck;

    public Controller(){
        this.view = new View();
        this.view.start();
    }

    public void setUpDeck(int maxNumber) {
        this.deck = new Deck(maxNumber);
    }


    //public getters
    public View getView() {
        return this.view;
    }
    public Deck getDeck() {
        return this.deck;
    }
}
