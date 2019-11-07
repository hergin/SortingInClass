package exporters;

import providers.NumberProvider;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("|----------------------|\n"
        + numbers + "\n|----------------------|");
    }
}
