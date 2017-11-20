package chapter07;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

class Outer {
    int outher_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner{
        void display() {
            System.out.println("Вывод: outher_x = " + outher_x);
        }
    }
}