package chapter09;

public class TestInface2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        CallBack ob = new AnotherClient();

        c.callback(42);

        c = ob;
        c.callback(42);
    }
}

class AnotherClient implements CallBack{

    public void callback(int param) {
        System.out.println("Еще один вариает вызова метода callback ");
        System.out.println("p в квадрате равно " + (param*param));
    }
}