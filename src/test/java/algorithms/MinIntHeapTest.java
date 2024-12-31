package algorithms;

import algorithms.MinIntHeap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinIntHeapTest {

    private MinIntHeap minHeap;

    @BeforeEach
    public void setUp() {
        minHeap = new MinIntHeap();
        minHeap.add(6);
        minHeap.add(5);
        minHeap.add(4);
        minHeap.add(3);
        minHeap.add(2);
        minHeap.add(1);
    }

    @Test
    public void Insert() {
        // Remember: The array walks top down / left to right
        Assertions.assertEquals(1, minHeap.items[0]);
        Assertions.assertEquals(3, minHeap.items[1]);
        Assertions.assertEquals(2, minHeap.items[2]);
        Assertions.assertEquals(6, minHeap.items[3]);
        Assertions.assertEquals(4, minHeap.items[4]);
        Assertions.assertEquals(5, minHeap.items[5]);
    }

    @Test
    public void ExtractMin() {
        Assertions.assertEquals(1, minHeap.extractMin());
        Assertions.assertEquals(2, minHeap.extractMin());
        Assertions.assertEquals(3, minHeap.extractMin());
        Assertions.assertEquals(4, minHeap.extractMin());
        Assertions.assertEquals(5, minHeap.extractMin());
        Assertions.assertEquals(6, minHeap.extractMin());
    }
}
