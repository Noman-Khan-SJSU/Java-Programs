package DataStructures.HashSet;

import org.junit.Test;
import static org.junit.Assert.*;

public class SetImplementationTest {

    @Test
    public void Test1() {
        SetImplementation set = new SetImplementation();
        assertFalse(set.contains(1));
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    public void Test2() {
        SetImplementation set = new SetImplementation();
        assertFalse(set.contains(2));
        assertFalse(set.contains(3));
        set.add(2);
        set.add(3);
        assertTrue(set.contains(2));
        assertTrue(set.contains(3));
    }

    @Test
    public void Test3() {
        SetImplementation set = new SetImplementation();
        assertEquals(0, set.size());
        set.add(4);
        set.add(4);
        set.add(4);
        assertEquals(1, set.size());
    }

    @Test
    public void Test4() {
        SetImplementation set = new SetImplementation();
        assertEquals(0, set.size());
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        assertEquals(5, set.size());
        set.remove(4);
        assertFalse(set.contains(4));
        assertTrue(set.contains(2));
        assertTrue(set.contains(6));
        assertEquals(4, set.size());
    }

}