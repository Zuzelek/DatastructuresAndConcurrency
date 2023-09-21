import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q1 {
    public static void main(String[] args) {

        List<String> names = new LinkedList<>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> nameIterator = names.listIterator();

        //Adding "Ray" after "Jay"
        while(nameIterator.hasNext())
        {
            String name = nameIterator.next();
            if(name.equals("Jay"))
            {
                nameIterator.add("Ray");
            }
        }
        names.remove("Jay");


        nameIterator = names.listIterator();

        //Printing names from the LinkedList from the beggining

        System.out.println("Names From Beggining");
        while(nameIterator.hasNext())
        {
            String namesFromBeggining = nameIterator.next();
            System.out.println(namesFromBeggining);
        }

        //Printing names from the LinkedList from the back
        System.out.println("\nNames from the back");
        while(nameIterator.hasPrevious())
        {
            System.out.println(nameIterator.previous());
        }

        names.add("Kay");

        nameIterator = names.listIterator();

        System.out.println("\n\nFinal state of LinkedList");
        while (nameIterator.hasNext())
        {
            System.out.println(nameIterator.next());
        }




    }
}
