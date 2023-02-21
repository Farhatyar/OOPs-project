package Task1;

public class Tester {
    public static void main(String[] args) {
        Shape [] shapes={new Circle(3),new Square(4)};
        for (Shape shape:shapes){
            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}
