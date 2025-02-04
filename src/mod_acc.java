public class mod_acc {
    public static void main(String[] args) throws Exception {
        NewClass cls = new NewClass();
        cls.Show();  // Now this works because Show() is inside MyClass
    }
}

class NewClass {
    private int a = 100;

    private void Display() {
        System.out.println("Private value of a is: " + a);
    }

    public void Show() {
        Display();  // Can call private method because it's inside the same class
        System.out.println("Accessing the private value of a: " + a);
    }
}
