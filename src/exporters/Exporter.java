package exporters;

import java.util.List;

public class Exporter implements NumberExporter {

    @Override
    public void export(List<Integer> numbers) {
        for (int i = 0; i <= numbers.size()-1; i++){
           System.out.println(numbers.get(i));
        }
    }
}
