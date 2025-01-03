package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashTableTest {

    private HashTable hashTable;

    @BeforeEach
    public void SetUp() {
        hashTable = new HashTable();
    }

    @Test
    public void PutAndGet() {
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Lisa Smith", "521-8976");
        hashTable.put("Sam Doe", "521-5030");
        hashTable.put("Sandra Dee", "521-9655");
        hashTable.put("Ted Baker", "418-4165");

        Assertions.assertEquals("521-1234", hashTable.get("John Smith"));
        Assertions.assertEquals("521-8976", hashTable.get("Lisa Smith"));
        Assertions.assertEquals("521-5030", hashTable.get("Sam Doe"));
        Assertions.assertEquals("521-9655", hashTable.get("Sandra Dee"));
        Assertions.assertEquals("418-4165", hashTable.get("Ted Baker"));
        Assertions.assertEquals(null, hashTable.get("Tim Lee"));

        hashTable.toString();
    }

    @Test
    public void Empty() {
        Assertions.assertEquals(null, hashTable.get("Ted Baker"));
        Assertions.assertEquals(null, hashTable.get("Tim Lee"));
        hashTable.toString();
    }

    @Test
    public void Collision() {
        // these keys will collide
        hashTable.put("John Smith", "521-1234");
        hashTable.put("Sandra Dee", "521-9655");

        Assertions.assertEquals("521-1234", hashTable.get("John Smith"));
        Assertions.assertEquals("521-9655", hashTable.get("Sandra Dee"));
        Assertions.assertEquals(null, hashTable.get("Tim Lee"));
    }
}
