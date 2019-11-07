package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println("The sorted numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
