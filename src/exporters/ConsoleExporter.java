package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {

        System.out.println();
        System.out.println("My Numbers:");
        System.out.println("___________________________________");

        for (int number : numbers){
            System.out.println("~ "+number);
        }
    }
}
