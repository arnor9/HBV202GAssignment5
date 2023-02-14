package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IntStackTest {
    IntStack stack;
    @Before
    public void constructNewStackedObject(){
        stack = new IntStack();
    }

    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }
    @Test
    public void testFullStackIsFull(){
        for(int i = 0; i < stack.getCapacity();i++){
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }
    @Test
    public void testFullStackIsAlmostFull(){
        for(int i = 0; i < stack.getCapacity() -1;i++){
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }
    @Test
    public void testPopReturnsPushValue(){
        int a = 10;
        stack.push(a);
        int b = stack.pop();
        assertEquals(a,b);
    }
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack(){
        stack.pop();
    }
    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack(){
        for(int i = 0; i < stack.getCapacity(); i++){
            stack.push(i);
        }
        stack.push(22);
    }
    @Test
    public void testIsEmpty1(){
        assertTrue(stack.isEmpty());
    }
    @Test
    public void testIsEmpty2(){
        stack.push(22);
        assertFalse(stack.isEmpty());
    }
}
