package assignment;

public class add {
    public static void main(String[] args) {
        Myfin obj=new Myfin(5,6);
        obj.Add();
    }
    
}
class Myfin
{
    int a=0,b=0;
    public Myfin(int first,int second)
    {
        a=first;
        b=second;
    }
    public void Add()
    {
       System.out.println(a+b);
    }
}
