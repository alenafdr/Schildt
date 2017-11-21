package chapter09;

public class TestInterface {
    public static void main(String[] args) {
        CallBack c = new Client();
        c.callback(42);
    }
}

interface CallBack{
    void callback(int param);
}

class Client implements CallBack{

    public void callback(int param) {
        System.out.println("Метод callback вызываемый со значением "+ param);
    }

    void nonIfaceMeth() {
        System.out.println("В классах, реализующих интерфейы, могут определяться и другие члены");
    }
}