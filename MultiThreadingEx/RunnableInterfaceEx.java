package MultiThreadingEx;

class MyCounter implements Runnable
{
    private int threadNo;

    public MyCounter(int threadNo)
    {
        this.threadNo =threadNo;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
        for(int i=0;i<=9;i++)
        {
            System.out.println("value of i is "+i+" and the thread no is "+threadNo);
        }

    }
}
public class RunnableInterfaceEx {
    
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyCounter(1));
        Thread thread2 =new Thread(new MyCounter(2));

        thread1.start();
        thread2.start();
    }
}
