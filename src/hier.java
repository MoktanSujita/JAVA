public class hier {
    public static void main(String[] args) throws Exception {
        B obj=new B();
        obj.MethodA();
        obj.MethodB();
    
        C obj1=new C();
        obj1.MethodA();
        obj1.MethodC();

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
class C extends A{
    public void MethodC()
    {
        System.out.println("Method C");
    }
}
