//method overriding
public class abstr
{
    public static void main(String[] args)
     {
         Shape s=new Circle();
        s.draw();
        Shape s1=new Rectangle();//to demostrate the method overriding otherwise Circle c=new Circle();
        s1.draw();
        
    }
}
abstract class Shape
{
    abstract void draw();
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape 
{
    void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}
//it can be done using interface too