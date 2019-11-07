package parsers;

import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ParseNumbersFromXMLTest {

    @Test
    void parseNumbers() {
        var xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<numbers>\n" +
                "    <number>12</number>\n" +
                "    <number>24</number>\n" +
                "    <number>22</number>\n" +
                "    <number>92</number>\n" +
                "    <number>35</number>\n" +
                "</numbers>";
        var result = new ParseNumbersFromXML().parseNumbers(Collections.singletonList(xmlContent));
        var expectedArray = new Object[]{12, 24, 22, 92, 35};
        assertArrayEquals(expectedArray, result.toArray());
    }
}