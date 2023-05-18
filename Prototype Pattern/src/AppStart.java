public class AppStart
{
    public static void main(String[] args)
    {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedSHape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedSHape2.getType());

        Shape clonedSHape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedSHape3.getType());
    }
}
