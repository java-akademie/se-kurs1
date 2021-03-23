package ch.jmildner.aufgaben.a5personen;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TextFile;
import ch.jmildner.uebungen2.uebung10.Person;

import java.io.FileNotFoundException;

public class PeopleArray
{
    final String FILE_NAME = "data/people.txt";

    Person[] p = new Person[1000];

    int numberOfPeople = 0;

    public void inputAddress()
    {
        System.out.println();
        p[numberOfPeople++] = new Person();
    }

    public void insert25People()
    {
        System.out.println();
        for (int i = 1; i <= 25; i++)
            p[numberOfPeople++] = new Person(true);
    }


    public void deleteAddress()
    {
        if (numberOfPeople == 0)
        {
            System.out.println("no Addresses to delete");
            return;
        }

        int idToDelete = MyTools.getInteger("enter ID to delete > ");

        int i;

        for (i = 0; i < numberOfPeople; i++)
        {
            if (p[i].getId() == idToDelete)
            {
                break;
            }
        }

        if (i < numberOfPeople)
        {
            p[i].setId(2_000_000_001);
            sortAddresses();
            numberOfPeople--;
            System.out.println("Address deleted");
        }
        else
        {
            System.out.println("no Address to delete");
        }

    }

    public void saveAddresses() throws FileNotFoundException
    {
        TextFile tf = new TextFile(FILE_NAME, 'o');

        for (int i = 0; i < numberOfPeople; i++)
        {
            tf.printLine(p[i].toString());
        }

        System.out.printf("%d Addresses written %n", numberOfPeople);

        tf.close();
    }

    public void showAddresses()
    {
        MyTools.h2("Addresses", 2);
        System.out.println("Number of Addresses: " + numberOfPeople);
        System.out.println();
        for (int i = 0; i < numberOfPeople; i++)
        {
            p[i].show();
        }
    }

    public void readAddresses()
    {
        TextFile tf;
        try
        {
            tf = new TextFile(FILE_NAME, 'i');

            String buffer;

            while ((buffer = tf.readLine()) != null)
            {
                p[numberOfPeople++] = new Person(buffer);
            }

            tf.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Addresses not available");
        }
    }

    public void sortAddresses()
    {
        if (numberOfPeople == 0)
        {
            System.out.println("no Addresses to sort");
            return;
        }

        for (int i = 0; i < numberOfPeople - 1; i++)
        {
            for (int j = i; j < numberOfPeople; j++)
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

}
