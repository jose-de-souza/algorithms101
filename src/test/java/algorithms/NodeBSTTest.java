package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeBSTTest {

    private NodeBST node;

    @BeforeEach
    public void SetUp() {
        node = new NodeBST(10);
        node.insert(5);
        node.insert(15);
        node.insert(8);
    }

    @Test
    public void Contains() {
        Assertions.assertTrue(node.contains(5));
        Assertions.assertTrue(node.contains(15));
        Assertions.assertTrue(node.contains(8));
    }

    @Test
    public void PrintOrder() {
        node.printInOrder();
    }
}
