public class chain {
    public static void main(String[] args) {
        Student st=new Student(); 
    }
    
}
class Student 
{
    public Student() 
    {
        this(5,7);
        System.out.println("Default Constructor");
    }
    public Student(int x, int y)
     {
        this(5);
        System.out.println("Multiple Parameter" +(x +y));
    }
    public Student(int x) 
    {
        System.out.println("Single parameter" +x);
    }
}