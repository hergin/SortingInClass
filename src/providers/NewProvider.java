package providers;

import java.util.List;
import java.util.*;

public class NewProvider implements NumberProvider{


    @Override
    public List<Integer> provideNumbers() {
        Scanner input = new Scanner(System.in);
        List<Integer> numbersList = new ArrayList<>();
        System.out.println("Enter the number of numbers you want to enter");
        int numberOfNumbers = input.nextInt();
        while(numbersList.size() < numberOfNumbers){
            System.out.println("enter a number");
            int numberInput = input.nextInt();
            numbersList.add(numberInput);
        }
        return numbersList;
    }
}
