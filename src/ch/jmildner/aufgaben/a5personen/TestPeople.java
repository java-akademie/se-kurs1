package ch.jmildner.aufgaben.a5personen;

import ch.jmildner.tools.MyTools;

import java.io.FileNotFoundException;

public class
TestPeople
{
    final static PeopleArray pa = new PeopleArray();

    public static void main(String[] args) throws FileNotFoundException
    {
        vorlauf();
        hptvera();
        nachlauf();
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
                pa.inputAddress();
                break;
            case 2:
                pa.showAddresses();
                break;
            case 3:
                pa.sortAddresses();
                break;
            case 4:
                pa.deleteAddress();
                break;
            case 5:
                pa.saveAddresses();
                break;
            case 6:
                showHelp();
                break;
            case 7:
                pa.insert25People();
                break;
            default:
                break;
        }
    }

    private static void vorlauf()
    {
        startMessage();
        pa.readAddresses();
    }


    private static void nachlauf() throws FileNotFoundException
    {
        pa.saveAddresses();
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
