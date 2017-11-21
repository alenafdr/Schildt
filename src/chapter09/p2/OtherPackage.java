package chapter09.p2;

public class OtherPackage {
    public OtherPackage() {
        chapter09.p1.Protection p = new chapter09.p1.Protection();
        System.out.println("конструктор из другого пакета");
        //System.out.println("n = " + p.n);
        //System.out.println("n_pri = " + p.n_pri);
        //System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
