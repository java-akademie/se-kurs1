package ch.jmildner.uebungen2.uebung10;

public class Student extends Person
{
    private int matrikelNumber;

    public Student()
    {
        super(true);
        setMatrikelNumber(112233);
    }

    public Student(int id, String name, String addr, int matrikelNumber)
    {
        super(id, name, addr);
        this.matrikelNumber = matrikelNumber;
    }

    public void show()
    {
        super.show();
        System.out.println("MatNr: " + matrikelNumber);
    }

    public int getMatrikelNumber()
    {
        return matrikelNumber;
    }

    public void setMatrikelNumber(int matrikelNumber)
    {
        this.matrikelNumber = matrikelNumber;
    }
}
