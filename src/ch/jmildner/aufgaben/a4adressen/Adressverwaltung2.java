package ch.jmildner.aufgaben.a4adressen;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TextFile;
import ch.jmildner.uebungen2.uebung10.Person;

import java.io.FileNotFoundException;

public class Adressverwaltung2
{
    static final String FILE_NAME = "data/addresses2.txt";

    static Person[] p = new Person[1000];

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
        p[maxAddresses++] = new Person();
    }

    private static void insert25People()
    {
        System.out.println();
        for (int i = 1; i <= 25; i++)
            p[maxAddresses++] = new Person(true);
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
            if (p[i].getId() == idToDelete)
            {
                break;
            }
        }

        if (i < maxAddresses)
        {
            p[i].setId(2_000_000_001);
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
            tf.printLine(p[i].toString());
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
            p[i].show();
        }
    }

    private static void readAddresses()
    {
        TextFile tf;
        try
        {
            tf = new TextFile(FILE_NAME, 'i');

            String buffer;

            while ((buffer = tf.readLine()) != null)
            {
                p[maxAddresses++] = new Person(buffer);
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
                if (p[i].getId() > p[j].getId())
                {
                    Person zp = p[i];
                    p[i] = p[j];
                    p[j] = zp;
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
        System.out.println("     7 = insert 25 people      ");
    }

    private static int getFunction()
    {
        System.out.println();

        return MyTools.getInteger(
                "please enter the Function (6=help) > ", 0, 7);
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
            case 7:
                insert25People();
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
