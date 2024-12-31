package datastructures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack stack;

    @BeforeEach
    public void SetUp() {
        stack = new Stack();
    }

    @Test
    public void Push() {
        stack.push(15);
        stack.push(25);
        stack.push(75);

        Assertions.assertEquals(3, stack.size());
        Assertions.assertEquals(75, stack.peek());
        Assertions.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void Pop() {
        stack.push(15);
        stack.push(25);
        stack.pop();
        stack.push(35);
        stack.pop();

        Assertions.assertEquals(15, stack.peek());
        Assertions.assertEquals(1, stack.size());
        Assertions.assertEquals(false, stack.isEmpty());
        Assertions.assertEquals(15, stack.pop());
    }
}
