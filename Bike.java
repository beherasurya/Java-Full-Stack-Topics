public class Bike extends  Vehicle{
    
    private String handle;

    public Bike() {

    }

    public Bike(String handle,String engine,int fuelTank, int wheels,String lights,int seats)
    {
        super(engine,wheels,seats,fuelTank,lights);
        this.handle = handle;

    }

    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike [getHandle=" + getHandle() +  "getEngine ,"+ getEngine() + getFuelTank() +getLights() +getSeats()
        +getWheels()+ "]";
    }

    public void run()
    {
        System.out.println("Bike is running"); 
    }

    
}
