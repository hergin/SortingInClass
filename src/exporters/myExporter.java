package exporters;

import java.util.List;

public class myExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("Exporter: " + numbers.toString());
    }
}
