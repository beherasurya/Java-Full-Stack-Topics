package CollectionsFramework;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("India");
        countries.add("USA");

        countries.add("Poland");
        countries.add("Egypt");

        for(String es : countries)
        {
            System.out.println(es);
        }
    }
}
