package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        System.out.println("Enter number of numbers you wish to sort: ");
        int numberOfNumbers = input.nextInt();
        while(numbersList.size() < numberOfNumbers){
            System.out.println("Enter number: ");
            int numberInput = input.nextInt();
            numbersList.add(numberInput);
        }
        return numbersList;
    }
}