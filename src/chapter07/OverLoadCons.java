package chapter07;

public class OverLoadCons {
    public static void main(String args[]){
        Box mybox1 = new Box(10,20,30);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);

        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox3.volume();
        System.out.println("Объем mybox1 равен " + vol);

    }
}

class Box{
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
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