package chapter08;

public class Override {
    public static void main(String[] args) {
        B3 subOb = new B3(1,2,3);
        subOb.show("Это k ");
        subOb.show();
    }
}

class A3 {
    int i, j;
    private int ip;

    public A3(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show(){
        System.out.println("i и j: " + i + " " + j);
    }
}

class B3 extends A3 {
    int k;

    public B3(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}



