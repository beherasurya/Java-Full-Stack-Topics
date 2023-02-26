package MultiThreadingEx;
class ThreadEx
{
    public static void main(String[] args) throws InterruptedException {
        MyCounter counter1=new MyCounter(1);
        MyCounter counter2=new MyCounter(2);

        long startTime=System.currentTimeMillis();

        counter1.start();
        // Thread.sleep(4500);
        counter2.start();

        long endTime =System.currentTimeMillis();
        System.out.println("Total time :"+(endTime - startTime));
 }
}

class MyCounter extends Thread
{
    private int threadNo;
    public MyCounter(int threadNo)
    {
        this.threadNo =threadNo;
    }

    public void run()
    {
        countMe();
    }
    public void countMe()
    {
        for(int i=1;i<=9;i++)
        {
            try
            {
                    sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("The value of is  is "+i +" and the thread no is : "+threadNo);
        }
    }

}