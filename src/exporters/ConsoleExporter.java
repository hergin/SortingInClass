package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter {

    public void export(List<Integer> numberList){
        for (int number : numberList) {
            System.out.println(number);
        }
    }




}
