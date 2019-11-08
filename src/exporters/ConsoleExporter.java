package exporters;

import java.util.List;

public class ConsoleExporter implements NumberExporter{

    @Override
    public void export(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            if (i == numbers.size() - 1) {
                System.out.print(i);
            }
            else {
                String iStr = String.valueOf(i);
                System.out.print(iStr + ", ");
            }
        }
    }

}
