import exporters.ExportToConsole;
import exporters.HTMLExporter;
import exporters.NumberExporter;
import providers.FromFileNumberProvider;
import providers.FromUserNumberProvider;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import sorters.BubbleSorter;
import sorters.NumberSorter;
import sorters.VeryBasicSorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        NumberProvider theProvider = null;
        theProvider = new FromUserNumberProvider();
        theProvider = new FromFileNumberProvider();
        theProvider = new RandomNumberProvider(System.nanoTime());

        var result = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + result.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = null;
        theSorter = new VeryBasicSorter();
        theSorter = new BubbleSorter();
        theSorter.sort(result);

        System.out.println("AFTER SORTING : [" + result.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = null;
        theExporter = new ExportToConsole();
        theExporter = new HTMLExporter("deneme");

        theExporter.export(result);
    }
}
