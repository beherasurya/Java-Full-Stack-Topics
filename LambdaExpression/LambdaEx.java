package LambdaExpression;

interface Lambda{
    public void demo();
}

public class LambdaEx {
    

    public static void main(String[] args) {
        Lambda lambda = new Lambda()
        {
            public void demo()
            {
                System.out.println("Lambda method");
            }
        };
        lambda.demo();

        Lambda lambda2 = ()->System.out.println("This is lambda method 2");
        lambda2.demo();

        Thread thread1 =new Thread(()-> System.out.println("I am inside the thread"));
        thread1.start();
    }
}


