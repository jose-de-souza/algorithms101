package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RecrusionTest {

    private Recursion recursion;

    @BeforeEach
    public void SetUp() {
        recursion = new Recursion();
    }


    /*
    Channel formatter

    Write a recursive algorithm that strips the leading zeros off Strings of text.

    Simply strip off one zero at a time, and then recursively call yourself
    until no leading zeros from the original string are left.
     */
    @Test
    public void StripLeadingZeros() {
        Assertions.assertEquals("1", recursion.stripZeros("0001"));
        Assertions.assertEquals("11", recursion.stripZeros("00011"));
        Assertions.assertEquals("1989", recursion.stripZeros("00001989"));
        Assertions.assertEquals("VOD", recursion.stripZeros("VOD"));
    }

}
