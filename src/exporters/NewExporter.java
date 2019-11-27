package exporters;

import java.util.List;

public class NewExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        for (Integer m:numbers
             ) {
            System.out.println(m);
        }
    }
}
