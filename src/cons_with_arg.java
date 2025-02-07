public class cons_with_arg
{
    public static void main(String[] args) throws Exception {
        MyClass obj=new MyClass(5,6);
        obj.Add();
    }
    
}
class MyClass
{
    int a=0,b=0;
    public MyClass(int first,int second)
    {
        a=first;
        b=second;
    }
    public void Add()
    {
        System.out.println(a+b);
    }
}
