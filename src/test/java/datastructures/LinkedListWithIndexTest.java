package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkedListWithIndexTest {

    private LinkedListWithIndex linkedList;

    @BeforeEach
    public void SetUp() {
        linkedList = new LinkedListWithIndex();
    }

    @Test
    public void GetByIndex() {
        linkedList.addFront(99, 1);
        linkedList.addFront(100, 2);
        linkedList.addFront(101, 3);

        Assertions.assertEquals(1, linkedList.getByIndex(99));
        Assertions.assertEquals(2, linkedList.getByIndex(100));
        Assertions.assertEquals(3, linkedList.getByIndex(101));
    }

}
