package ch.jmildner.aufgaben.a4adressen;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TextFile;

import java.io.FileNotFoundException;

public class AdrVerw11
{
    static final String FILE_NAME = "data/addresses1.txt";

    static final int[] id = new int[1000];
    static final String[] name = new String[1000];
    static final String[] adr = new String[1000];

    static int maxAddresses;

    public static void main(String[] args) throws FileNotFoundException
    {
        readAddresses();
        showAddresses();
    }

    private static void showAddresses()
    {
        MyTools.h1("Addresses", 2);
        System.out.println("    Number of Addresses: " + maxAddresses);
        System.out.println();
        for (int i = 0; i < maxAddresses; i++)
        {
            System.out.println("       ID      : " + id[i]);
            System.out.println("       Name    : " + name[i]);
            System.out.println("       Address : " + adr[i]);
            System.out.println();
        }
    }

    private static void readAddresses()
    {
        TextFile tf;
        try
        {
            tf = new TextFile(FILE_NAME, 'i');

            String idx = tf.readLine();

            while (idx != null)
            {
                id[maxAddresses] = Integer.parseInt(idx);
                name[maxAddresses] = tf.readLine();
                adr[maxAddresses] = tf.readLine();
                maxAddresses++;

                idx = tf.readLine();
            }
            tf.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Addresses not available");
        }
    }
}
