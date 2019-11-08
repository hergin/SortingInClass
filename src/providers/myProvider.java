package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class myProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {
        System.out.println("Please Enter The Number Of Numbers You Would Like To Use");
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();
        int numbersAsInt = Integer.parseInt(numbers);

        List<Integer> numList = new ArrayList<>();
        System.out.println("Please Enter " + numbersAsInt + " Numbers");
        for(int i = 0; i < numbersAsInt; i++) {
            String givenNum = scanner.next();
            int givenNumAsInt = Integer.parseInt(givenNum);
            numList.add(givenNumAsInt);
        }
        return numList;
    }
}
