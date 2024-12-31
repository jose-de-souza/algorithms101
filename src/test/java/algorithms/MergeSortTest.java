package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    public void SetUp() {
        mergeSort = new MergeSort();
    }

    @Test
    public void Sort() {

        //           l                  r
        int arr[] = {4, 7, 14, 1, 3, 9, 17};

        int l = 0;              // left pointer
        int r = arr.length - 1; // right pointer

        mergeSort.sort(arr, l, r);

        Assertions.assertEquals(1, arr[0]);
        Assertions.assertEquals(3, arr[1]);
        Assertions.assertEquals(4, arr[2]);
        Assertions.assertEquals(7, arr[3]);
        Assertions.assertEquals(9, arr[4]);
        Assertions.assertEquals(14, arr[5]);
        Assertions.assertEquals(17, arr[6]);

        System.out.println("\nSorted array");
        mergeSort.printArray(arr);
    }

}
