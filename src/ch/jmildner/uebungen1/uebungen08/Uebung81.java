package ch.jmildner.uebungen1.uebungen08;

public class Uebung81
{
    public static void main(String[] args)
    {
        test1();
        test2();
    }

    public static void test1()
    {
        String[] names = new String[10];
        names[0] = "hugo";
        names[1] = "urs";
        names[2] = "fritz";
        names[3] = "bill";
        names[4] = "eric";
        names[5] = "anna";
        names[6] = "hugo";
        names[7] = "berta";
        names[8] = "joe";
        names[9] = "jim";

        for (String name : names)
        {
            System.out.println(name);
        }
    }

    public static void test2()
    {
        String[] names1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        for (String n : names1)
        {
            System.out.println(n);
        }
    }
}
