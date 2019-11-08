import exporters.HTMLExporter;
import exporters.NumberExporter;
import exporters.myExporter;
import providers.NumberProvider;
import providers.RandomNumberProvider;
import providers.myProvider;
import sorters.NumberSorter;
import sorters.mySorter;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        NumberProvider theProvider = new myProvider();

        var theNumbers = theProvider.provideNumbers();

        System.out.println("BEFORE SORTING: [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberSorter theSorter = new mySorter();
        theSorter.sort(theNumbers);

        System.out.println("AFTER SORTING : [" + theNumbers.stream().map(Object::toString).collect(Collectors.joining(",")) + "]");

        NumberExporter theExporter = new myExporter();
        theExporter.export(theNumbers);
    }
}
