package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CP3LinkedListTest {
    private CP3LinkedList linkedListTesting;
    LinkedList<String> list = new LinkedList<>();
    public static void main(String[] args) {



    }
    @BeforeEach
    public void setUp(){
        list.add("Alan");
        list.add("Alex");
        list.add("Kamil");
        list.add("Billy");
    }
    @Test
    public void testCorrectSize(){
        LinkedList<String> list = new LinkedList<>();


        assertEquals(4,list.size());
    }
    @Test
    public void testWrongSize(){
        assertEquals(5,list.size());
    }
    @Test
    @Description("Valid test for contains method")
    public void testContains()
    {
        assertTrue(list.contains("Alan"));
    }
    @Test
    @Description("Invalid test for contains method")
    public void testContains2()
    {
        assertTrue(list.contains("Kokorola"));
    }
    @Test
    public void testAddLast(){
        list.addLast("Hello");

    }


}
