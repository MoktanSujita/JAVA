//returns the class of the object
public class getclass {
    public static void main(String[] args) {
        Object obj =new String("Swastik");
        Class c=obj.getClass();
        System.out.println("Class of the Object obj is:" +c.getName());
        
    }
    
}
