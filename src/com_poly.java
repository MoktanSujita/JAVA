public class com_poly {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(4,5));
        System.out.println(cal.add(5, 6, 5));
    }
    
}
class Calculator{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
