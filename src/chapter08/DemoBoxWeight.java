package chapter08;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);
        System.out.println("Вес myboxl равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}

class Box{
    double width;
    double height;
    double depth;

    public double volume(){
        return width*height*depth;
    }

    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width =  height = depth = len;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}

class BoxWeight extends Box {
    double weight;


    public BoxWeight(double w, double h, double d, double weight) {
        super(w, h, d);
        this.weight = weight;
    }
}

class ColorBox extends Box{
    int color;

    public ColorBox(double w, double h, double d, int color) {
        super(w, h, d);
        this.color = color;
    }
}