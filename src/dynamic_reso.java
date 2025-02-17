public class dynamic_reso {
    public static void main(String[] args) throws Exception {
        Cat c=new Cat();
        c.eats();
        c.move();
    }
}
class Animal //parent class
{
    public void eats()
    {
        System.out.println("Dog eats");
    }
}
class Cat extends Animal //child class with inheritance
{
    public void eats()
    {
        System.out.println("Cat drinks milk");
    }
    public void move()
    {
        System.out.println("Cat moves fast");
    }
}
/*overriding =redefine the method of super/parent class
->must be inheritated
->All the abstract methods in the parent class must be defined in child class aftr inheritance
->Static method, dynamic method*/