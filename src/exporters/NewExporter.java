package exporters;

import java.util.List;
import java.util.stream.Collectors;

public class NewExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("The numbers are: " + numbers.stream().map(Object::toString).collect(Collectors.joining(",")) );
    }
}
