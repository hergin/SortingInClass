import exporters.HTMLExporter;
import exporters.NumberExporter;
import exporters.SimpleExporter;
import providers.FromFileNumberProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import providers.SimpleNumberProvider;
import sorters.BubbleSorter;
import sorters.NumberSorter;
import sorters.SimpleSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new SimpleNumberProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new SimpleSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new SimpleExporter();
        theExporter.export(theNumbers);
    }
}
