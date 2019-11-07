package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {

    private List<Integer> numberList;

    public ConsoleExporter(List<Integer> numberList){
        this.numberList = numberList;
    }

    @Override
    public void export(List<Integer> numbers) {
        System.out.println(numbers);
    }
}
