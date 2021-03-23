package ch.jmildner.uebungen2.uebung10;

import ch.jmildner.tools.MyTools;

public class TestPerson
{
    public static void main(String[] args)
    {
        MyTools.h1("TestPeople");

        test1();
        test2();
        test3();
        test4();
    }

    private static void test1()
    {
        MyTools.h1("Test1");
        MyTools.h2("Test1");
        MyTools.h2("Test1");
        Person p1 = new Person(1243, "max", "basel");
        Person p2 = new Person(4711, "urs", "genf");
        Person p3 = new Person(2345, "ann", "wien");
        p1.show();
        p2.show();
        p3.show();
        System.out.println();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
    }

    private static void test2()
    {
        MyTools.h2("Test2", 1);
        Person p1 = new Person(true);
        Person p2 = new Person(true);
        p1.show();
        p2.show();
        System.out.println();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
    }

    private static void test3()
    {
        MyTools.h2("Test3", 1);
        Person p1 = new Person("4422~max~basel");
        Person p2 = new Person("4422~max~basel");
        Person p3 = new Person("1234~urs~bern");
        p1.show();
        p2.show();
        p3.show();
        System.out.println();
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);
        System.out.println();
        System.out.printf("%s=%s; %b %n", p1, p2, p1.equals(p2));
        System.out.printf("%s=%s; %b %n", p2, p3, p2.equals(p3));
    }

    private static void test4()
    {
        MyTools.h2("Test4", 1);
        Person p1 = new Person(true);
        p1.setId(111);
        p1.setName("ludwig");
        p1.setAddr("berlin");
        p1.show();
        System.out.println();
        System.out.println("p1.id   : " + p1.getId());
        System.out.println("p1.name : " + p1.getName());
        System.out.println("p1.addr : " + p1.getAddr());
    }
}
