package exporters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleExporter implements NumberExporter {
    @Override
    public void export(List<Integer> numbers) {
        // Extra space and title for readability ease
        System.out.println("\n= MY NUMBERS: =");

        // Runs a loop outputting the sorted numbers
        for (var number : numbers)
        {
            // Prompts user for their input
            System.out.println("- " + number);
        }

        // Another extra space for readability ease
        System.out.println("\n");
    }
}
