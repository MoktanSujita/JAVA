public class call_by_value {
    public static void main(String[] args) throws Exception {
        Rectangle rect=new Rectangle();
        System.out.println("value before changing" +rect.a);
        rect.Display(500);
        System.out.println("Value after changing" +rect.a);
    }
}
class Rectangle 
{
    int a=100;
    public void Display(int a)
    {
        a=a+100;
    }
}
