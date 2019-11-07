package sorters;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DefaultSorterTest {

    @Test
    void sort() {
        var exampleList = Arrays.asList(4, 3, 2, 1);
        new DefaultSorter().sort(exampleList);

        var sorted = Arrays.asList(1, 2, 3, 4);
        assertArrayEquals(sorted.toArray(), exampleList.toArray());
    }
}