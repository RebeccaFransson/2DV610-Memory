package main;

/**
 * Created by ymafr on 2016-11-14.
 */
public class View {
    private StringBuffer stringBuffer;

    public View(){
        stringBuffer = new StringBuffer();
    }
    public void start(){
        stringBuffer.append("Let's start! \n Pick a even number between 2 and 40:");
        System.out.println(stringBuffer);
    }
    public String getStringBuffer(){
        return this.stringBuffer.toString();
    }
}
