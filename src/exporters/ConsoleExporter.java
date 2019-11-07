package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers){
        System.out.println("Sorted Numbers");
        System.out.println("******************");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
