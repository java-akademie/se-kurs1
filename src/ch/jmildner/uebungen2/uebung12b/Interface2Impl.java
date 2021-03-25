package ch.jmildner.uebungen2.uebung12b;

public class Interface2Impl implements Interface2 {

    @Override
    public void method1() {
        System.out.println("method1");
        this.defaultMethod1();
        this.defaultMethod2();
        Interface2.staticMethod1();
    }

    @Override
    public void method2() {
        System.out.println("method2");
        this.defaultMethod1();
        this.defaultMethod2();
        Interface2.staticMethod1();
    }
}
