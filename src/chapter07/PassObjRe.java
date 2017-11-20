package chapter07;

public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);

        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}

class Test3{
    int a,b;

    public Test3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void meth(Test3 o){
        o.a *= 2;
        o.b /=2;
    }
}