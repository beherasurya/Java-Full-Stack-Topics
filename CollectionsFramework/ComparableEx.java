package CollectionsFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.jar.Attributes.Name;

import javax.lang.model.util.ElementScanner6;

class Names implements Comparable<Names>
{

    public String name;
    public Names(String name)
    {
        this.name =name;
    }
    @Override
    public int compareTo(Names o) {
        // TODO Auto-generated method stub

        if(name.length() == o.name.length())
        {
            return 0;
        }
        else if(name.length() < o.name.length())
        {
            return 1;
        }
        else 
            return -1;
    }
    @Override
    public String toString() {
        return "Names [name=" + name + "]";
    }

    
}
public class ComparableEx {
    public static void main(String[] args) {
       
        List names =new LinkedList<>();
        names.add(new Names("Chaand"));
        names.add(new Names("Mia"));
        names.add(new Names("John"));
        names.add(new Names("Marry"));
        names.add(new Names("Peter"));


        ListIterator<Names> iterator =names.listIterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
