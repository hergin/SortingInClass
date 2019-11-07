package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        System.out.println("How many numbers would you like to enter?");
        Scanner scanner = new Scanner(System.in);
        int numberToGet = Integer.parseInt(scanner.nextLine());
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < numberToGet; i++){
            System.out.print("> ");
            output.add(scanner.nextInt());
        }
        return output;
    }
}
