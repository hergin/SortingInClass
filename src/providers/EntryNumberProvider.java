package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntryNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers will be entered?");
        int listSize = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < listSize; i++){
            System.out.println("Current List: " + numbers);
            System.out.print("New Number: ");
            numbers.add(scanner.nextInt());
        }

        return numbers;
    }
}
