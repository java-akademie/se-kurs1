package ch.jmildner.aufgaben.a3berechnungen;


import ch.jmildner.tools.MyTools;

public class Berechnungen
{
    private static void help()
    {
        System.out.println();
        System.out.println("Function:");
        System.out.println("     0 = end of Program               ");
        System.out.println("     1 = kreis                        ");
        System.out.println("     2 = quadrat                      ");
        System.out.println("     3 = kugel (under construction)   ");
        System.out.println("     4 = help                         ");
    }


    private static int getFunction()
    {
        System.out.println();

        return MyTools.getInteger(
                "please enter a function (4=help) > ", 0, 4);
    }


    private static void hptvera()
    {
        help();

        int function = getFunction();

        while (function != 0)
        {
            vera(function);
            function = getFunction();
        }
    }


    private static void kreis()
    {
        System.out.println();
        System.out.println("Kreis:");

        int radius = MyTools
                .getInteger("     enter radius > ");

        double flaeche = radius * radius * 3.14159;
        double umfang = 2 * radius * 3.14159;

        System.out.println("" + "the Area is: " + flaeche
                + ", the circumference is: " + umfang);
    }


    private static void kugel()
    {
        System.out.println();
        System.out.println("Kugel:");
        System.out.println("this function is under construction");
    }


    public static void main(String[] args)
    {
        vorlauf();
        hptvera();
        nachlauf();
    }


    private static void nachlauf()
    {
        stopMessage();
    }


    private static void quadrat()
    {
        System.out.println();
        System.out.println("Quadrat:");

        int length = MyTools
                .getInteger("     please enter the length > ");
        int width = MyTools
                .getInteger("     please enter the width  > ");

        int flaeche = length * width;
        int umfang = 2 * length + 2 * width;

        System.out.println("" + "the area is: " + flaeche + ", the perimeter is: " + umfang);

    }


    private static void startMessage()
    {
        System.out.println();
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Program     : Berechnungen");
        System.out.println("Author      : Johann Mildner");
        System.out.println("Description : This is a Program that can do some calculations");
        System.out.println("-------------------------------------------------------------");
    }


    private static void stopMessage()
    {
        System.out.println();
        System.out.println("Good bye!");
        System.out.println("-------------------------------------------------------------");
        System.out.println();
    }


    public static void vera(int function)
    {
        switch (function)
        {
            case 1:
                kreis();
                break;
            case 2:
                quadrat();
                break;
            case 3:
                kugel();
                break;
            case 4:
                help();
                break;
            default:
                break;
        }
    }


    private static void vorlauf()
    {
        startMessage();
    }
}
