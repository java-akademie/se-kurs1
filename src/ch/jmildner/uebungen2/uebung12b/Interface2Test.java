package ch.jmildner.uebungen2.uebung12b;

import ch.jmildner.tools.MyTools;

public class Interface2Test {

    public static void main(String[] args) {
        MyTools.h1("Interface2Test");

        MyTools.h2("Interface2.staticMethod1()");
        Interface2.staticMethod1();

        var ii2 = new Interface2Impl();

        MyTools.h2("ii2.method1()");
        ii2.method1();

        MyTools.h2("ii2.method2()");
        ii2.method2();

        MyTools.h2("ii2.defaultMethod1)");
        ii2.defaultMethod1();

        MyTools.h2("ii2.defaultMethod2)");
        ii2.defaultMethod2();
    }

}
