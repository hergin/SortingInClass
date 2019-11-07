package parsers;

import java.util.ArrayList;
import java.util.List;

public class ParseNumbersFromCSV implements NumberParser {
    @Override
    public List<Integer> parseNumbers(List<String> content) {
        List<Integer> result = new ArrayList<>();

        for (var line : content) {
            var elements = line.split(",");
            for (var element : elements) {
                result.add(Integer.parseInt(element));
            }
        }

        return result;
    }
}
