package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @BeforeEach
    public void SetUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assertions.assertEquals(3, linkedList.getFirst());
        Assertions.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void GetFirst() {
        linkedList.addFront(1);
        Assertions.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void GetLast() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assertions.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void AddBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assertions.assertEquals(1, linkedList.getFirst());
        Assertions.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void Size() {
        Assertions.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assertions.assertEquals(1, linkedList.size());
        linkedList.addBack(2);
        Assertions.assertEquals(2, linkedList.size());
    }

    @Test
    public void Clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();

        Assertions.assertEquals(0, linkedList.size());
    }

    @Test
    public void DeleteValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteValue(2);

        Assertions.assertEquals(2, linkedList.size());
        Assertions.assertEquals(1, linkedList.getFirst());
        Assertions.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void DeleteLastValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.addBack(4);

        linkedList.deleteValue(4);

        Assertions.assertEquals(3, linkedList.size());
        Assertions.assertEquals(1, linkedList.getFirst());
        Assertions.assertEquals(3, linkedList.getLast());

        linkedList.print();
    }

}
