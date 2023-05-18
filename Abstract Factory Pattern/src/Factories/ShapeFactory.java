package Factories;

import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

public class ShapeFactory extends AbstractFactory
{
    @Override
    public Shape getShape(String shapeType)
    {
        if(shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }

        return null;
    }
}
