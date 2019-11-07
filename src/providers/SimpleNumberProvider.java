package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class SimpleNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();
        Scanner type = new Scanner(System.in);
        System.out.printf("Enter total number of numbers that need to be sorted: ");
        int totalNumbers = parseInt(type.nextLine());
        for (int i = totalNumbers; i > 0; i--){
            System.out.printf("Enter a number to be sorted. You have %d left: ",i);
            int number = type.nextInt();
            resultingList.add(number);

        }
        return resultingList;

    }


    }

