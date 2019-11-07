package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FromUserProvider implements NumberProvider {

    @Override
    public List<Integer> provideNumbers(){
        List<Integer> numbers = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        System.out.println("How many numbers are being entered?");
        int amount = Integer.parseInt(console.nextLine());
        System.out.println("Enter the numbers!");
        for(int i = 0; i < amount; i++){
            numbers.add(Integer.parseInt(console.nextLine()));
        }
        return numbers;
    }
}
