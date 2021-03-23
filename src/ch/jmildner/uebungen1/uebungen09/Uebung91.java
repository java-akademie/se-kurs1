package ch.jmildner.uebungen1.uebungen09;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TextFile;

public class Uebung91
{
    public static void main(String[] args) throws Exception
    {
        TextFile tf = new TextFile("temp/text.txt", 'o');

        String s = getText();

        while (!s.equals("$$$"))
        {
            tf.printLine(s);
            s = getText();
        }

        tf.close();
    }

    private static String getText()
    {
        return MyTools.getString("enter Text (end=$$$) > ");
    }
}
