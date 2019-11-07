package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        List<Integer> result = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers you will enter: ");

        int howMany = scanner.nextInt();

        for (int i = 1; i <= howMany; i++) {
            System.out.print("Enter the next number (" + i + "/" + howMany + "): ");
            result.add(scanner.nextInt());
        }

        System.out.println("Thanks...");

        return result;
    }
}
