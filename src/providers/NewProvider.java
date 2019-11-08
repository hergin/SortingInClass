package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider
{

    @Override
    public static List<Integer> provideNumbers()
    {
        System.out.println("How many number will you enter?:");
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt():
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < amount; i++)
        {
            System.out.println("Number List;" + list);
            list.add(input.nextInt());
        }
        return list;
    }
}
