import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       try {
        System.out.println("Enter your numerator:");
        int a=scanner.nextInt();
        System.out.println("Enter your denominator:");
        int b=scanner.nextInt();
        if(b==0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int result=a/b;
        System.out.println("Result:" +result);
       } 
       catch (ArithmeticException e) {

        System.err.println("Error:" +e.getMessage());
       }
       finally 
       {
        System.out.println("Finally block executed");
        scanner.close();
       }
    }
    
}
