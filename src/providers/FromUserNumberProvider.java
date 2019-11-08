package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        // Creates the list that will contain the random numbers
        List<Integer> resultingList = new ArrayList<>();

        // Creates the scanner that will read the console.
        Scanner in = new Scanner(System.in);

        // Prompts the user for an input on the amount of #s they'd like to input
        System.out.println("How many numbers would you like to input?");
        var amountOfNum = in.nextInt();

        // Extra space for readability ease
        System.out.println();

        // Runs a loop asking the user for their chosen amount of numbers
        for (int i = 1; i <= amountOfNum; i++)
        {
            // Prompts user for their input
            System.out.println("Please input #" + i + ":");

            // Collects and then saves the input
            resultingList.add(in.nextInt());
        }

        // Another extra space for readability ease
        System.out.println();

        // Returns the created list
        return resultingList;
    }
}
