package ch.jmildner.uebungen2.uebung12b;

public interface Interface2 {

    void method1();    // public abstract, must be implemented

    void method2();    // public abstract, must be implemented

    static void staticMethod1() {
        System.out.println("static method1");
        staticMethod2();
    }

    private static void staticMethod2() {
        System.out.println("static method2");
    }

    default void defaultMethod1() {
        System.out.println("default method1");
        defaultMethod3();
        privateMethod();
    }

    default void defaultMethod2() {
        System.out.println("default method2");
        defaultMethod3();
        privateMethod();
    }

    default void defaultMethod3() {
        System.out.println("default method3");
        staticMethod1();
        staticMethod2();
    }

    private void privateMethod() {
        System.out.println("private method");
        defaultMethod3();
    }

}
