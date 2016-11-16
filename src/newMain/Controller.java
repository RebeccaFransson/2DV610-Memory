package newMain;

/**
 * Created by ymafr on 2016-11-16.
 */
public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;
    }

    public static void main(String[] args) {
        //initialize it self
        //Can be extracted to a run-class?
    }

    public void run() {
        this.view.printStart();
    }
}
