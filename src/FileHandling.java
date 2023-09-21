import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\\\Users\\\\t00223033\\\\Desktop\\\\hamlet.txt";

        Set<String> words = new TreeSet<>();

        Map<String, Integer> mapForWords = new HashMap<>();


        try{
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;

            while (in.hasNext()){
                Scanner lineParser = new Scanner(in.nextLine());

                lineParser.useDelimiter("[^A-Za-z0-9]+");

                while (lineParser.hasNext()){
                    String word = lineParser.next();;
                    words.add(word);
                    System.out.println(word);
                }

            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Iterator<String> nameIterator = words.iterator();

        while(nameIterator.hasNext())
        {
            System.out.println(nameIterator.next());
        }




    }
}
