//threading through runnable 
public class App {
    public static void main(String[] args) throws Exception
     {
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable);
        thread.start();
    }

}
class MyRunnable implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}