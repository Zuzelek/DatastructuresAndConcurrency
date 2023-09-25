package Lab2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CP3LinkedListTest {
    private CP3LinkedList LinkedListTesting;
    public static void main(String[] args) {



    }
    @Test
    public void testSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Alan");
        list.add("Alex");
        list.add("Kamil");
        list.add("Billy");

        assertEquals(5,list.size());
    }
}
