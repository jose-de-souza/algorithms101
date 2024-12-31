package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//
// Note: This is code for a future episode. Stay tuned!
//

public class TrieTest {

    private Trie trie;

    @BeforeEach
    public void SetUp() {
        trie = new Trie();
    }

    @Test
    public void StartsWith() {
        trie.insert("Apple");
        Assertions.assertTrue(trie.startsWith("A"));
        Assertions.assertTrue(trie.startsWith("Ap"));
        Assertions.assertTrue(trie.startsWith("App"));
        Assertions.assertTrue(trie.startsWith("Appl"));
        Assertions.assertTrue(trie.startsWith("Apple"));
    }

    @Test
    public void ContainsWord() {
        trie.insert("pot");
        trie.insert("past");
        trie.insert("pass");
        trie.insert("part");

        Assertions.assertTrue(trie.containsWord("pot"));
        Assertions.assertTrue(trie.containsWord("past"));
        Assertions.assertTrue(trie.containsWord("pass"));
        Assertions.assertTrue(trie.containsWord("part"));
        Assertions.assertFalse(trie.containsWord("ps"));
    }
}
