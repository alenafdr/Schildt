package chapter06;

public class BoxDemo6 {
    public static void main(String args[]){
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}

class Box6{
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }

    Box6(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
}
