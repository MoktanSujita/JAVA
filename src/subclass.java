public class subclass
{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.Show();
    }
}
class Animal
{
    protected int a;
    protected void display()
    {
        System.out.println("Dog is an animal");
    }

}
 class Dog extends Animal
 {
    public void Show()
    {
        display();
        System.out.println(a);
    }
 }

    


    
