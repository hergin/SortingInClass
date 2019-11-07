package providers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class UserNumberProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        List<Integer> resultingList = new ArrayList<>();
        int nums = parseInt(scanner.nextLine());
        for(int i = 0; i< nums; i++){
            System.out.println("Enter the next number");
            resultingList.add(i, parseInt(scanner.nextLine()));

        }
        System.out.println(resultingList);
        return resultingList;
    }
}
