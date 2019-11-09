package exporters;

import java.util.List;

public class CLExporter implements NumberExporter {

    @Override
    public void export(List<Integer> numbers) {

        System.out.print("My Numbers\n");
        for(int number : numbers)
            System.out.printf("\t-%d\n", number);
    }
}
