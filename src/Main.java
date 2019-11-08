import exporters.Exporter;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.NumberProvider;
import providers.ProviderOfNumbers;
import sorters.NumberSorter;
import sorters.Sorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new ProviderOfNumbers();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new Sorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new Exporter();
        theExporter.export(theNumbers);
    }
}
