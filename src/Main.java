import exporters.ConsoleExporter;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.ConsoleProvider;
import providers.NumberProvider;
import sorters.BuiltInSorter;
import sorters.NumberSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //NumberProvider theProvider = new RandomNumberProvider(System.nanoTime());
        //NumberProvider theProvider = new FromFileNumberProvider();
        NumberProvider theProvider = new ConsoleProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new BuiltInSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        //NumberExporter theExporter = new HTMLExporter("numbersFormatted");
        NumberExporter theExporter = new ConsoleExporter();
        theExporter.export(theNumbers);
    }
}
