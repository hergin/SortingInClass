import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NumberSorter;
import sorters.QuickSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new RandomNumberProvider(System.nanoTime());

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new BubbleSorter();
        theSorter.sort(theNumbers);
        NumberSorter theSorter2 = new QuickSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new HTMLExporter("numbersFormatted");
        theExporter.export(theNumbers);
    }
}
