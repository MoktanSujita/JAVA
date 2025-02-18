public class run_poly {  //overloading
    public static void main(String[] args) {
        Dog an=new Dog();
        an.eat();
    }
    
}
class Animal
{
    public void eat()
    {
       System.out.println("Dog eats.");
    }
}
 class Dog extends Animal
    {
        public void eat()
        {  
          super.eat();
          System.out.println("It has tail");
        }
    }


