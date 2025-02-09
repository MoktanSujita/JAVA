public class mult_level {
    public static void main(String[] args) throws Exception {
        C obj=new C();
        obj.MethodA();
        obj.MethodB();
        obj.MethodC();
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
class C extends B{
    public void MethodC()
    {
        System.out.println("Method C");
    }
}
