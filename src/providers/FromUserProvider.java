package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserProvider implements NumberProvider{

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> newList = new ArrayList<>();
        Scanner inputFromConsole = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you would like to enter: ");
        String n = inputFromConsole.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            System.out.println("Enter a number to add to the list");
            String newNumber = inputFromConsole.nextLine();
            newList.add(Integer.parseInt(newNumber));
        }
        return newList;
    }

}
