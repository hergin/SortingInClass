import exporters.HTMLExporter;
import exporters.NewExporter;
import exporters.NumberExporter;
import providers.FromFileNumberProvider;
import providers.NewProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NewSorter;
import sorters.NumberSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new NewProvider();

        var theNumbers = NewProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new NewSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new NewExporter();
        theExporter.export(theNumbers);
    }
}
