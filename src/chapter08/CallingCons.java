package chapter08;

public class CallingCons {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}

class A2{
    public A2() {
        System.out.println("В конструкторе А");
    }
}

class B2 extends A2{
    public B2() {
        System.out.println("В конструкторе B");
    }
}

class C2 extends B2{
    public C2() {
        System.out.println("В конструкторе C");
    }
}