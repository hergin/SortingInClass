package exporters;

import java.util.List;
import java.util.stream.Collectors;

public class ExportToConsole implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("Exporting to the console...");
        System.out.println("[" + numbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");
        System.out.println("Export success!");
    }
}
