package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.printf("%d, ", number);
        }
    }
}
