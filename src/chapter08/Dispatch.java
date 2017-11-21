package chapter08;

public class Dispatch {
    public static void main(String[] args) {
        A4 a = new A4();
        B4 b = new B4();
        C4 c = new C4();

        A4 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}

class A4{
    void callme(){
        System.out.println("В методе callme() из класса А");
    }
}

class B4 extends A4{
    void callme(){
        System.out.println("В методе callme() из класса В");
    }
}

class C4 extends B4{
    void callme(){
        System.out.println("В методе callme() из класса C");
    }
}