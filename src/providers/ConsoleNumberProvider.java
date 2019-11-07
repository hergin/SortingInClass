package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {

        List<Integer> resultingList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?:  ");
        int total = input.nextInt();

        for(int x = 1; x <= total; x++) {
            System.out.println("Please, enter a new number:  ");
            resultingList.add(input.nextInt());
        }

        System.out.println("Thank you");

        return resultingList;

    }

}
