package CollectionsFramework;

import java.util.ArrayList;

public class ListArray {
    static ArrayList<String> listNames =new ArrayList<>();
    public static void main(String[] args) {
        listNames.add("Chaand");
        listNames.add("John");
        System.out.println(listNames);

        listNames.contains("John");
        System.out.println(listNames.indexOf("John"));

        ArrayList list1 =new ArrayList<>();
        list1.add(1);

        System.out.println(list1);
    }
}
