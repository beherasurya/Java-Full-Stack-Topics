package MultiThreadingEx;

public class SynchronizationEx {

    public static int counter =0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 =new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=1;i<=1000;i++)
                {
                    SynchronizationEx.counter++;
                }
            }
        } );
        thread1.start();
        Thread.sleep(2000);
        System.out.println("THe value of counter is "+SynchronizationEx.counter);    
    }
   
}
