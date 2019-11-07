package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleNumberProvider implements NumberProvider {
    Scanner in = new Scanner(System.in);

    @Override
    public List<Integer> provideNumbers() {
        System.out.println("How many number to process?");
        int amount = in.nextInt();
        List<Integer> result = new ArrayList<Integer>();
        for (int i=0; i < amount; i++) {
            System.out.println("Input a number: ");
            result.add(in.nextInt());
        }
        return result;
    }
}
