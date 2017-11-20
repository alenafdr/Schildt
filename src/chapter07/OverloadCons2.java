package chapter07;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10,20,15);
        Box2 mybox2 = new Box2();
        Box2 mycube = new Box2(7);
        Box2 myclone = new Box2(mybox1);

        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм myboxl равен " + vol);

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);

        vol = myclone.volume();
        System.out.println("Oбъeм myclone равен " + vol);
    }

}

class Box2{
    double width;
    double height;
    double depth;

    public double volume(){
        return width*height*depth;
    }

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
}