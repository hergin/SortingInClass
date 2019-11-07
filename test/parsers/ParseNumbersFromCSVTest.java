package parsers;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ParseNumbersFromCSVTest {

    @Test
    void parseNumbers() {
        var csvContent = "1,2,3,4,5";
        var result = new ParseNumbersFromCSV().parseNumbers(Collections.singletonList(csvContent));
        var expectedArray = new Object[]{1, 2, 3, 4, 5};
        assertArrayEquals(expectedArray, result.toArray());
    }
}