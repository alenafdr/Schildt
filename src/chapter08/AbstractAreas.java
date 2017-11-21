package chapter08;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure2 f = new Figure2(10,10);
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        Figure2 figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}

abstract class Figure2 {
    double dim1;
    double dim2;

    public Figure2(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle2 extends Figure2 {
    public Rectangle2(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area(){
        System.out.println("В области четырехугольника");
        return dim1*dim2;
    }
}

class Triangle2 extends Figure2{
    public Triangle2(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area(){
        System.out.println("В области треугольника");
        return dim1*dim2/2;
    }
}