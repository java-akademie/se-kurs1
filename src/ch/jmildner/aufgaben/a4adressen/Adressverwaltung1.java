package ch.jmildner.aufgaben.a4adressen;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TextFile;

import java.io.FileNotFoundException;

public class Adressverwaltung1
{
    static final String FILE_NAME = "data/addresses1.txt";

    static final int[] id = new int[1000];
    static final String[] name = new String[1000];
    static final String[] adr = new String[1000];

    static int maxAddresses;


    public static void main(String[] args) throws FileNotFoundException
    {
        vorlauf();
        hptvera();
        nachlauf();
    }

    private static void inputAddress()
    {
        System.out.println();

        id[maxAddresses] = MyTools.getInteger("ID       > ", 1,
                2000000000);
        name[maxAddresses] = MyTools.getString("Name     > ");
        adr[maxAddresses] = MyTools.getString("Address  > ");

        maxAddresses++;
    }


    private static void deleteAddress()
    {
        if (maxAddresses == 0)
        {
            System.out.println("no Addresses to delete");
            return;
        }

        int idToDelete = MyTools.getInteger("enter ID to delete > ");

        int i;

        for (i = 0; i < maxAddresses; i++)
        {
            if (id[i] == idToDelete)
            {
                break;
            }
        }

        if (i < maxAddresses)
        {
            id[i] = 2000000001;
            sortAddresses();
            maxAddresses--;
            System.out.println("Address deleted");
        }
        else
        {
            System.out.println("no Address to delete");
        }

    }

    private static void saveAddresses()
            throws FileNotFoundException
    {
        TextFile tf = new TextFile(FILE_NAME, 'o');

        for (int i = 0; i < maxAddresses; i++)
        {
            tf.printLine(id[i] + "");
            tf.printLine(name[i]);
            tf.printLine(adr[i]);
        }

        System.out.printf("%d Addresses written %n", maxAddresses);

        tf.close();
    }

    private static void showAddresses()
    {
        MyTools.h2("Addresses", 2);
        System.out.println("Number of Addresses: " + maxAddresses);
        System.out.println();
        for (int i = 0; i < maxAddresses; i++)
        {
            System.out.println("ID      : " + id[i]);
            System.out.println("Name    : " + name[i]);
            System.out.println("Address : " + adr[i]);
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

    private static void sortAddresses()
    {
        if (maxAddresses == 0)
        {
            System.out.println("no Addresses to sort");
            return;
        }

        for (int i = 0; i < maxAddresses - 1; i++)
        {
            for (int j = i; j < maxAddresses; j++)
            {
                if (id[i] > id[j])
                {
                    int zId = id[i];
                    id[i] = id[j];
                    id[j] = zId;
                    String zName = name[i];
                    name[i] = name[j];
                    name[j] = zName;
                    String zAdr = adr[i];
                    adr[i] = adr[j];
                    adr[j] = zAdr;
                }
            }
        }
        System.out.println("Addresses sorted");
    }

    private static void showHelp()
    {
        System.out.println();
        System.out.println("Function:");
        System.out.println("     0 = end of Program        ");
        System.out.println("     1 = input Address         ");
        System.out.println("     2 = show Addresses        ");
        System.out.println("     3 = sort Addresses        ");
        System.out.println("     4 = delete Address        ");
        System.out.println("     5 = save Addresses        ");
        System.out.println("     6 = show Help             ");
    }

    private static int getFunction()
    {
        System.out.println();

        return MyTools.getInteger(
                "please enter the Function (6=help) > ", 0, 6);
    }

    private static void hptvera() throws FileNotFoundException
    {
        showHelp();

        int function = getFunction();

        while (function != 0)
        {
            vera(function);
            function = getFunction();
        }
    }

    private static void vera(int function) throws FileNotFoundException
    {
        switch (function)
        {
            case 1:
                inputAddress();
                break;
            case 2:
                showAddresses();
                break;
            case 3:
                sortAddresses();
                break;
            case 4:
                deleteAddress();
                break;
            case 5:
                saveAddresses();
                break;
            case 6:
                showHelp();
                break;
            default:
                break;
        }
    }

    private static void vorlauf()
    {
        startMessage();
        readAddresses();
    }


    private static void nachlauf() throws FileNotFoundException
    {
        saveAddresses();
        stopMessage();
    }

    private static void startMessage()
    {
        System.out.println();
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Program: Adressverwaltung.java");
        System.out.println("Author : Johann Mildner");
        System.out.println("------------------------------");
    }

    private static void stopMessage()
    {
        System.out.println();
        System.out.println("Good bye!");
        System.out.println("------------------------------");
        System.out.println();
    }

}
