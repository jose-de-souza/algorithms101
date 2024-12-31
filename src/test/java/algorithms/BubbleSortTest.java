package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    public void SetUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void Sort() {
        int[] array = {5, 1, 4, 2, 8};

        int[] sorted = bubbleSort.sort(array);

        Assertions.assertEquals(1, sorted[0]);
        Assertions.assertEquals(2, sorted[1]);
        Assertions.assertEquals(4, sorted[2]);
        Assertions.assertEquals(5, sorted[3]);
        Assertions.assertEquals(8, sorted[4]);
    }

}
