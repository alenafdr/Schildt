package chapter09;

public class NestedDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if(nif.isNotNegative(10)) System.out.println("Число 10 не отрицательное");
        if(nif.isNotNegative(-12)) System.out.println("это не будет выведено");
    }
}

class A {
    public interface NestedIF {
        boolean isNotNegative(int i);
    }
}

class B implements A.NestedIF {

    public boolean isNotNegative(int i) {
        return i < 0 ? false : true;
    }
}