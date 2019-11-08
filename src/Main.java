import exporters.HTMLExporter;
import exporters.NewExporter;
import exporters.NumberExporter;
import providers.NewProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.BuiltInSorter;
import sorters.NumberSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        //NumberProvider FromFileNumberProvider = new RandomNumberProvider(System.nanoTime());
        NumberProvider theProvider = new NewProvider();

        //var theNumbers = FromFileNumberProvider.provideNumbers();
        var theNumbers = NumberProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        //NumberSorter theSorter = new BubbleSorter();
        //theSorter.sort(theNumbers);

        NumberSorter theSorter = new BuiltInSorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        //NumberExporter theExporter = new HTMLExporter("numbersFormatted");
        //theExporter.export(theNumbers);
        NumberExporter theExporter = new NewExporter();
        theExporter.export(theNumbers);
    }
}
