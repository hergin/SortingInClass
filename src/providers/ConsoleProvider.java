package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will be entered?");
        int requestedNumber = scanner.nextInt();
        System.out.println("You will enter " + requestedNumber + " numbers");
        List <Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < requestedNumber; i++ ){
            System.out.println("Type number here: ");
            userNumbers.add(scanner.nextInt());
        }
        return userNumbers;
    }
}
