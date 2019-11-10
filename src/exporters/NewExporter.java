package exporters;
import java.util.ArrayList;
import java.util.List;

public class NewExporter implements NumberExporter {
    private Integer Numbers;

    @Override
    public void export(List<Integer> numbers) {
        System.out.print("Number in sorted in the following ");
        for ( int number: numbers){
                System.out.print(number+", ");
            }
        }
    }
