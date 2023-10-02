package Lab3;

import java.util.Deque;
import java.util.LinkedList;
import static org.junit.jupiter.api.Assertions.*;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Stack {
    public static void main(String[] args) {

        @Test
        public void testIsBalanced() {
            assertTrue(isBalanced(""));
        }
        @Test
        public void testAreMatching() {
            assertTrue(areMatching('(', ')'));
        }
    }
    public static boolean isBalanced(String expression)
    {
        Deque stack = new LinkedList();

        boolean balanced = true;
        int index = 0; //index indicates current position in expression
        while(balanced && index < expression.length())
        {
            //ch = next char in expression
            char ch = expression.charAt(index);

            if(ch == '(')
            {
                stack.addFirst(ch);
            }
            else if(ch == ')')
            {
                if(stack.isEmpty())
                {
                    balanced = false;
                }
                else
                {
                    char topChar = (char) stack.removeFirst();
                    if(topChar != ch)
                    {
                        balanced = false;
                    }
                }
            }
            index++;
        }
        if(balanced == true && stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private static boolean isOpen(char ch)
    {
        if(ch == '(' || ch == '{' || ch == '[' || ch  == '<')
            return true;
        else
            return false;
    }
    private static boolean isClose(char ch)
    {
        if(ch == ')' || ch == '}' || ch == ']' || ch  == '>')
            return true;
        else
            return false;
    }
    private static boolean areMatching(char c1, char c2)
    {
        if(c1 == '(' && c2 == ')' || c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']'
          || c1 == '<' && c2 == '>')
            return true;
        else
            return false;
    }

}
