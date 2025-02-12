//WAP tp demostrate encapsulation using Setter and getter
public class get_set
{
    public static void main(String[] args)
    {
        Calculation cal=new Calculation();
        cal.setA(3);
        cal.setB(5);
        System.out.println(cal.getA() +cal.getB());
    }
    
    
}
class Calculation
{
    private int a;
    private int b;
    //right click-> source->generate setter and getter ->tick->enter
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
}
