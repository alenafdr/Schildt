package chapter07;

public class Overload2 {
    public static void main(String args[]){
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 88;

        ob.test();
        ob.test(10,20);

        ob.test(i);
        ob.test(123.2);
    }
}

class OverloadDemo2{
    void test(){
        System.out.println("Пapaмeтpы отсутствуют");
    }

    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }

    void test(double a){
        System.out.println("Внутреннее преобразование при вызове test(douЬle)а: " + a );

    }
}