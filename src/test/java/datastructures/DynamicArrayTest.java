package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DynamicArrayTest {

    private DynamicArray array;

    @BeforeEach
    public void SetUp() {
        array = new DynamicArray<String>(2);
    }

    @Test
    public void GetAndSet() {
        array.set(0, "a");
        Assertions.assertEquals("a", array.get(0));
    }

    @Test
    public void Insert() {
        array.add("a"); // 0
        array.add("b"); // 1
        array.add("c"); // 2

        array.insert(1, "d");

        Assertions.assertEquals(4, array.size());
        Assertions.assertEquals("a", array.get(0));
        Assertions.assertEquals("d", array.get(1));
        Assertions.assertEquals("b", array.get(2));
        Assertions.assertEquals("c", array.get(3));
    }

    @Test
    public void DeleteFirst() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(0);

        Assertions.assertEquals(2, array.size());
        Assertions.assertEquals("b", array.get(0));
        Assertions.assertEquals("c", array.get(1));
        Assertions.assertEquals(null, array.get(2));
    }

    @Test
    public void DeleteMiddle() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(1);

        Assertions.assertEquals(2, array.size());
        Assertions.assertEquals("a", array.get(0));
        Assertions.assertEquals("c", array.get(1));
        Assertions.assertEquals(null, array.get(2));
    }

    @Test
    public void DeleteLast() {
        array.add("a");
        array.add("b");
        array.add("c");

        array.delete(2);

        Assertions.assertEquals(2, array.size());
        Assertions.assertEquals("a", array.get(0));
        Assertions.assertEquals("b", array.get(1));
        Assertions.assertEquals(null, array.get(2));
    }

    @Test
    public void isEmpty() {
        Assertions.assertTrue(array.isEmpty());
        array.add("a");
        Assertions.assertFalse(array.isEmpty());
    }

    @Test
    public void Contains()  {
        Assertions.assertFalse(array.Contains("a"));
        array.add("a");
        Assertions.assertTrue(array.Contains("a"));
        array.add("b");
        array.add("b");
        array.add("c");
        Assertions.assertTrue(array.Contains("b"));
        Assertions.assertTrue(array.Contains("c"));
        array.delete(3);
        Assertions.assertFalse(array.Contains("c"));
        array.delete(2);
        Assertions.assertTrue(array.Contains("b"));
        array.delete(1);
        Assertions.assertFalse(array.Contains("b"));
        array.delete(0);
        Assertions.assertFalse(array.Contains("a"));
    }

}
