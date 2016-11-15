package main;

import java.util.Scanner;

/**
 * Created by ymafr on 2016-11-14.
 */
public class Run {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        View view = new View();
        System.out.println(view.start());
        //Vänta på svar från användare
        int maxNumber = scan.nextInt();
        //Starta Deck med maxvärdet från användare
        //Så länge det finns cards kvar så får användaren gissa
        try{
            Deck deck = new Deck(maxNumber);
            while (deck.canGuess()){
                //Print the deck
                System.out.println(view.printDeck(deck));
                int number = scan.nextInt();
                int number2 = scan.nextInt();
                System.out.println(view.checkTwoShowNrs(deck, number, number2));
            }
            System.out.println("Yey you did it! And it only took "+deck.getTurns()+" turns");
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
