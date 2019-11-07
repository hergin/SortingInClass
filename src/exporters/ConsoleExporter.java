package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {

    @Override
    public void export(List<Integer> numbers) {

        System.out.println("---The Sorted Numbers---");

        for(int x = 0; x < numbers.size(); x++) {
            System.out.println(numbers.get(x));
        }

    }

}
