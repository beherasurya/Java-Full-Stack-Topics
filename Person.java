public abstract class Person {
    

    public void speak()
    {
        System.out.println("Shares his/her thoughts");
    }
    public abstract void eat();

    Person p1 =new Person() {
        public  void eat()
        {
                System.out.println("hii");
        }
    };
}
