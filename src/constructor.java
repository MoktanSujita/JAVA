public class constructor 
{
    public static void main(String[] args) throws Exception {
        MyClass obj=new MyClass();
        obj.Show();
    }
    
}
class MyClass
{
    int a=0;
    public MyClass()
    {
        a=5;
        
    }
    public void Show()
    {
        System.out.println(a);
    }
}
