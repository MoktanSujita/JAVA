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
/*class rectangle
 * {
 * int a; ->instance variable
 * int b;
 * public Rectangle(int a,int b)->local variable
 * {
 * this.a=a;
 * this.b=b;
 * }
 * }
 * current class methods and field
 * difference betwen local and static variable
 */