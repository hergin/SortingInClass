package exporters;
import java.util.List;
import java.util.stream.Collectors;

public class Console implements NumberExporter {
    @Override
    public void export(List<Integer> theNumbers) {
        System.out.println("Console Exporter Output  : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

    }
}
