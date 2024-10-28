
class Shape {
    protected String name;


    public Shape(String name) {
        this.name = name;
    }


    public void area() {
        System.out.println("Unknown area");
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }


    public Rectangle(double side) {
        this(side, side);
    }


    @Override
    public void area() {
        double area = length * width;
        System.out.println("The area of the " + name + " is: " + area);
    }
}


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.area();

        System.out.println();


        Rectangle square = new Rectangle(4.0);
        square.area();
    }
}
