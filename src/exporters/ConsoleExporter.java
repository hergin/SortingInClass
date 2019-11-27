package exporters;

import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class ConsoleExporter implements NumberExporter {
    public void export(List<Integer> numbers) {
        System.out.print("Sorted numbers are: ");
        for (var number : numbers) {
            System.out.print(number + ", ");
        }
    }
}
