public class simple_in {
    public static void main(String[] args) throws Exception {
        B obj=new B();
        obj.MethodA();
        obj.MethodB();
        
    }
    
}
class A
{
    public void MethodA()
    {
        System.out.println("Method A");
    }
}
class B extends A 
{
        public void MethodB()
        {
            System.out.println("Method B");
        }
}
