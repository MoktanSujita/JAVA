//threading through anonymous inner class
public class threadingin {

    public static void main(String[] args) throws Exception
     {
        Thread t1=new Thread()
        {
            public void run()
            {
                System.out.println("thread is running");
            }
        };
        t1.start();
    }
}

