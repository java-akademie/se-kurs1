package ch.jmildner.uebungen2.uebung10;

import ch.jmildner.tools.MyTools;
import ch.jmildner.tools.TestDatenTools;

import java.util.Objects;

public class Person
{
    private int id;
    private String name;
    private String addr;

    public Person(boolean... random)
    {
        if (random.length == 1 && random[0])
        {
            id = MyTools.getRandom(1000, 9999);
            name = TestDatenTools.getName();
           // addr = TestDatenTools.getAdresse();
        }
        else
        {
            id = MyTools.getInteger("enter ID   > ");
            name = MyTools.getString("enter Name > ");
           // addr = MyTools.getString("enter Addr > ");
        }
    }

    public Person(int id, String name, String addr)
    {
        this.id = id;
        this.name = name;
        this.addr = addr;
    }

    public Person(String buffer)
    {
        System.out.println(buffer);
        String[] arr = buffer.split("~");
        id = Integer.parseInt(arr[0]);
        name = arr[1];
        addr = arr[2];
    }

    public void show()
    {
        System.out.println();
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Addr : " + addr);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id);
    }

    @Override
    public String toString()
    {
        return id + "~" + name + "~" + addr;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddr()
    {
        return addr;
    }

    public void setAddr(String addr)
    {
        this.addr = addr;
    }
}