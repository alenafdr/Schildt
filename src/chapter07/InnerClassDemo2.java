package chapter07;

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outher2 outer = new Outher2();
        outer.test();
    }
}

class Outher2{
    int outher_x = 100;

    void test() {
        for(int i=0;i<10;i++){
            class Inner2 {
                void display() {
                    System.out.println("Вывод: outher_x = " + outher_x);
                }
            }
            Inner2 inner = new Inner2();
            inner.display();
        }
    }
}