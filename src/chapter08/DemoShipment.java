package chapter08;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10,20,15,10,3.41);
        Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipment1 равен " + vol);
        System.out.println("Вес shipment1 равен " + shipment1.weight);
        System.out.println("Стоимость доставки $ " + shipment1.coast);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен " + vol);
        System.out.println("Вес shipment2 равен " + shipment2.weight);
        System.out.println("Стоимость доставки $ " + shipment2.coast);
    }
}

class Box2{
    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len){
        width =  height = depth = len;
    }

    Box2(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    public double volume(){
        return width*height*depth;
    }
}

class BoxWeight2 extends Box2 {
    double weight;

    public BoxWeight2(BoxWeight2 ob) {
        super(ob);
        this.weight = ob.weight;
    }

    public BoxWeight2() {
        super();
        this.weight = -1;
    }

    public BoxWeight2(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public BoxWeight2(double w, double h, double d, double weight) {
        super(w, h, d);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight2 {
    double coast;

    public Shipment(Shipment ob) {
        super(ob);
        this.coast = ob.coast;
    }

    public Shipment() {
        super();
        this.coast = -1;
    }

    public Shipment(double w, double h, double d, double weight, double coast) {
        super(w, h, d, weight);
        this.coast = coast;
    }

    public Shipment(double len, double weight, double coast) {
        super(len, weight);
        this.coast = coast;
    }

}