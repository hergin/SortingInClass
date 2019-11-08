package providers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider
{

    @Override
    public static List<Integer> provideNumbers()
    {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many number will you enter?:");
        int amount = input.nextInt();
        System.out.print("Enter numbers: ");
        int numbers = input.nextInt();
        int[] integers = new int[amount];
        for(int i = 0; i < amount; i++)
        {
            integers[i] = input.nextInt();
        }
        return Collections.singletonList(numbers);
        while (input.hasNextInt())
        {
            int i = input.nextInt();
            list.add(i);
        }
        return list;
    }
}
