package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        System.out.println();
        System.out.println("===================My Numbers=======================");
        for(var number : numbers){
            System.out.println();
            System.out.println(number);
        }
        System.out.println("====================================================");
    }
}
