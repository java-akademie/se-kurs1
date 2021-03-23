package ch.jmildner.uebungen1.uebungen09;

import ch.jmildner.tools.TextFile;

public class Uebung92
{
    public static void main(String[] args) throws Exception
    {
        TextFile tf = new TextFile("temp/text.txt", 'i');

        String s = tf.readLine();

        while (s != null)
        {
            System.out.println(s);
            s = tf.readLine();
        }

        tf.close();
    }
}
