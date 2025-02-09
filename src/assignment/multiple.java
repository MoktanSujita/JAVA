package assignment;
public class multiple {
    public static void main(String[] args) throws Exception {
        C obj=new C();
       int sum= obj.Add(3,2);
       int sub= obj.Sub(4,4);
        System.out.println("Add=" +sum);
        System.out.println("Sub=" +sub);
        
    }
    
}
interface A
{
  int Add(int x,int y);  
}
interface B
{
   int Sub(int x,int y);
}
class C implements A,B{
    public int Add(int x,int y)
    {
        return x+y;
    }
    public int Sub(int x,int y)
    {
        return x-y;
    }
}

