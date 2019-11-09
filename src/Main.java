import exporters.ConsoleExporter;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import providers.UserInputNumberProvider;
import sorters.BubbleSorter;
import sorters.EzSorter;
import sorters.NumberSorter;

import java.io.Console;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new UserInputNumberProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new EzSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new ConsoleExporter();
        theExporter.export(theNumbers);
    }
}
