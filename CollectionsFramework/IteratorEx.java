package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(8);
        numbers.add(6);
        
        Iterator iterator =numbers.iterator();
        while(iterator.hasNext())
        {
            System.out.println("Element: "+iterator.next());
        }

        numbers.sort(null);
        System.out.println(numbers);

        Collections.reverse(numbers);
    }
}
