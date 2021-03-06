package main;

/**
 * Created by ymafr on 2016-11-14.
 */
public class View {
    private StringBuffer stringBuffer;
    public final static String START = "Let's start! \nPick a even number between 2 and 40:";

    public View(){
        stringBuffer = new StringBuffer();
    }
    public void start(){
        this.stringBuffer.append("Let's start! \nPick a even number between 2 and 40:");
        System.out.println(this.stringBuffer.toString());
    }

    public String printDeck(Deck deck){
        this.stringBuffer.setLength(0);//Clearing the buffer
        int length = 0;
        for (Card c: deck.getDeck()) {
            if(length < deck.getMaxCards()*0.2){
                length++;
                this.stringBuffer.append(c.getShowNr()+"\t");
            }else{
                length = 0;
                this.stringBuffer.append(c.getShowNr()+"\n");
            }

        }
        return this.stringBuffer.toString();
    }

    public String checkTwoShowNrs(Deck deck, int nr, int nr2) {
        this.stringBuffer.setLength(0);//Clearing the buffer
        Card card = deck.getCardFromShowNr(nr);
        Card card2 = deck.getCardFromShowNr(nr2);
        //card.equalLetters -> true -> removeCard
        if(card.equals(card2)){
            this.stringBuffer.append("You cant pick the same nr.");
        }
        deck.addTurn();
        if (card.equalLetters(card2)){
            deck.removeCard(card);
            deck.removeCard(card2);
            this.stringBuffer.append(card.getLetter()+" and "+card2.getLetter()+": Its the same, one point!");
        }else{
            this.stringBuffer.append(card.getLetter()+" and "+card2.getLetter()+": Its not the same...");
        }
        return this.stringBuffer.toString();
    }

    //getter
    public String getStringBuffer(){
        return this.stringBuffer.toString();
    }
}
