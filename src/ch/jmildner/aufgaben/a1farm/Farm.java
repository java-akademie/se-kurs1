package ch.jmildner.aufgaben.a1farm;

import ch.jmildner.tools.MyTools;

public class Farm
{
    public static void main(String[] args) throws Exception
    {
        MyTools.h1("Farm");

        int heads = MyTools.getInteger("please enter heads > ", 0,
                1000000);

        String prompt = String.format(
                "please enter legs between %d and %d > ",
                heads * 2, heads * 4);

        int legs;

        while (true)
        {
            legs = MyTools.getInteger(prompt, heads * 2, heads * 4);

            if (!(legs % 2 == 0))
            {
                System.out.print(
                        "number of legs must be even ... ");
            }
            else
                break;
        }
        int hens = 0;
        int pigs = heads;

        while (!(hens * 2 + pigs * 4 == legs))
        {
            hens++;
            pigs--;
        }

        System.out.printf("the farmer has %d hens and %d pigs.%n",
                hens, pigs);
    }
}

