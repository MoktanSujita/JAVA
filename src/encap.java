//Wap to show encapsulation using private access modifier
public class encap {
    public static void main(String[] args)
     {
         Calculation cal=new Calculation(4, 9);
         cal.Add();
        
    }
    
}
class Calculation 
{
    private int a;
    private int b;
    public Calculation(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public void Add()
    {
        System.out.println(a+b);
    }

}
