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
        stringBuffer.append("Welcome");
        System.out.println(stringBuffer);
    }
    public String getStringBuffer(){
        return this.stringBuffer.toString();
    }
}
