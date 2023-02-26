package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Lambda2 {
    public static void main(String[] args) {
        

        List <Integer>  list =new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(15);
        list.add(10);
        list.add(11);

        list.forEach((elements)->{
            System.out.println(elements);
        });
    }
}
