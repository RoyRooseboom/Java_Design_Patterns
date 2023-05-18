import Shapes.Shape;

public class AppStart
{
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}
