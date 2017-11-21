package chapter09;

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}

interface A1 {
    void meth1();
    void meth2();
}

interface B2 extends A1{
    void meth3();
}

class MyClass implements B2{
    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3");
    }
}