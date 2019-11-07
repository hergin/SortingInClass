import exporters.HTMLExporter;
import exporters.NumberExporter;
import exporters.TemporaryFileExporter;
import providers.FromEntryNumberProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.InsertionSorter;
import sorters.NumberSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        NumberProvider theProvider = new FromEntryNumberProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new InsertionSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new TemporaryFileExporter();
        theExporter.export(theNumbers);
    }
}
