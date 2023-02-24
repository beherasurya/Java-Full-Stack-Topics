 class MethodOverloading {
    
    public static void main(String[] args) {
       System.out.println(area(5 ,5)); 
       System.out.println(area(5)); 

    }
    public static double area(double length, double width)
    {
        return length * width;
    }

    public static double area(double side)
    {
        return side * side;
    }
}
