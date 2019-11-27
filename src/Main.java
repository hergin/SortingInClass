import exporters.HTMLExporter;
import exporters.NewExport;
import exporters.NumberExporter;
import providers.NewProviders;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NewSorter;
import sorters.NumberSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new NewProviders();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new NewSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new NewExport();
        theExporter.export(theNumbers);
    }
}
