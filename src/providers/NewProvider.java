package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter: ");
        int number = input.nextInt();

        for (int i = 0; i<number; i++){
            System.out.println("Enter a number: ");
            int newNumber = input.nextInt();
            list.add(newNumber);
        }

        return list;
    }
}
