package newMain;

import java.io.PrintStream;

/**
 * Created by ymafr on 2016-11-16.
 */
public class View {

    private PrintStream out;

    public final static String START = "Welcome, let's start! \nPick a even number between 2 and 40:";

    public View(PrintStream out){
        this.out = out;
    }
    public void printStart() {
        out.println(START);
    }

}
