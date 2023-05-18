import Factories.AbstractFactory;
import Factories.RoundedShapeFactory;
import Factories.ShapeFactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(boolean rounded)
    {
        if(rounded)
        {
            return new RoundedShapeFactory();
        }
        else
        {
            return new ShapeFactory();
        }
    }
}
