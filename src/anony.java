
abstract class Utilities 
{
    abstract void display();
}
public class anony {
    public static void main(String[] args) {
        Utilities p=new Utilities()
        {
            void display()
            {
                System.out.println("Good things don't last");
            }
        };
        p.display();
    }
    
}