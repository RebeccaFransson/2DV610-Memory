package main;

import java.util.Scanner;

/**
 * Created by ymafr on 2016-11-14.
 */
public class Run {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        View view = new View();
        view.start();
        //Vänta på svar från användare
        int maxNumber = scan.nextInt();
        //Starta Deck med maxvärdet från användare
        //Så länge det finns cards kvar så får användaren gissa
        try{
            Deck deck = new Deck(maxNumber);
            //Print the deck
            int number = scan.nextInt();
            int number2 = scan.nextInt();
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }

        //Vänta på användarens två svar
        //jämnför dessa
        //Skrev ut till användaren omd e var samma
    }
}
