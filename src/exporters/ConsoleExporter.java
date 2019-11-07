package exporters;

import providers.NumberProvider;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.print("Your Sorted List: " + numbers.toString());
    }
}
