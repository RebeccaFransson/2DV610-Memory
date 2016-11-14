package main;

/**
 * Created by ymafr on 2016-11-14.
 */
public class View {
    private StringBuffer stringBuffer;

    public View(){
        stringBuffer = new StringBuffer();
    }
    public String start(){
        this.stringBuffer.append("Let's start! \nPick a even number between 2 and 40:");
        return this.stringBuffer.toString();
    }

    public String printDeck(Deck deck){
        this.stringBuffer.delete(0, this.stringBuffer.length());//Clearing the buffer
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

    //getter
    public String getStringBuffer(){
        return this.stringBuffer.toString();
    }
}
