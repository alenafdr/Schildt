package chapter07;

public class RetOb {
    public static void main(String[] args) {
        Test4 ob1 = new Test4(2);
        Test4 ob2;

        ob2 = ob1.incrByTen();

        System.out.println( "ob1.а: " + ob1.a);
        System.out.println( "ob2.a: " + ob2.a );

        ob2 = ob2.incrByTen();
        System.out.println( "ob2.a полсе второго увеличения значения: " + ob2.a );
    }
}

class Test4{
    int a;

    public Test4(int a) {
        this.a = a;
    }

    Test4 incrByTen(){
        Test4 temp = new Test4(a + 10);
        return temp;
    }
}