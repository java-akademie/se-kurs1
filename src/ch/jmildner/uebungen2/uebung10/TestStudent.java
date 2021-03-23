package ch.jmildner.uebungen2.uebung10;

import ch.jmildner.tools.MyTools;

public class TestStudent
{
    public static void main(String[] args)
    {
        MyTools.h1("TestStudents");
        Student s1 = new Student(1243, "max", "basel", 403121);
        Student s2 = new Student(4711, "urs", "genf", 912342);
        Student s3 = new Student(3124, "ann", "wien", 234867);
        Student s4 = new Student();

        show(s1);
        show(s2);
        show(s3);
        show(s4);
    }

    private static void show(Student s)
    {
        s.show();
        System.out.println();
        System.out.println("s.id    : " + s.getId());
        System.out.println("s.name  : " + s.getName());
        System.out.println("s.addr  : " + s.getAddr());
        System.out.println("s.matNr : " + s.getMatrikelNumber());
    }
}
