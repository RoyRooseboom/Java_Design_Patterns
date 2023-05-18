import Factories.AbstractFactory;
import Shapes.Shape;

public class AppStart
{
    public static void main (String[] args)
    {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();


        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedRectangle = roundedShapeFactory.getShape("Rectangle");
        roundedRectangle.draw();

        Shape roundedSquare = roundedShapeFactory.getShape("Square");
        roundedSquare.draw();

    }
}
