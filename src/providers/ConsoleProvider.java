package providers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        System.out.println("How many numbers will you put in?");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int i;
        while (true) {
            try {
                i = Integer.parseInt(input);
                break;

            } catch (Exception e) {
                System.out.println("Please put in a number not the crap you just put in");
            }
        }
        List<Integer> numList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            System.out.println("enter number");
            int num;
            while (true) {
                try {
                    String line = s.nextLine();
                    num = Integer.parseInt(line);
                    break;
                } catch (Exception e) {
                    System.out.println("Not a number");
                }
            }
            numList.add(num);
        }
        return numList;
    }
}
