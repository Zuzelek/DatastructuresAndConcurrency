import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        //Doesn't allow duplicates
        Set<String> names = new TreeSet<>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Fay");
        Iterator<String> hashIterator = names.iterator();

        while (hashIterator.hasNext())
        {
            System.out.println(hashIterator.next());
        }




    }
}
