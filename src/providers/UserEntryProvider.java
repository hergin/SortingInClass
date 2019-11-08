package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class UserEntryProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        int number = input.nextInt();

        while (resultingList.size() < number) {
            System.out.print("Enter a number: ");
            int numbers = input.nextInt();

            resultingList.add(numbers);

        }
        return resultingList;
    }
}


