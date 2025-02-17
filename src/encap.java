//Wap to show encapsulation using private access modifier
public class encap {
    public static void main(String[] args)
     {
         Calculation cal=new Calculation(4, 9);
         cal.add();
        
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
    public void add()
    {
        System.out.println(a+b);
    }

}
