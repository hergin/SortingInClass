package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputNumberProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("how many numbers do you wish to enter?");
        String amount = in.nextLine();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < Integer.parseInt(amount); i++) {
            System.out.println("What will the next number be?");
            String newNumberString = in.nextLine();
            int newNumber = Integer.parseInt(newNumberString);
            numberList.add(newNumber);
        }
        return numberList;
    }
}
