package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider
{
    @Override
    public List<Integer> provideNumbers()
    {
        List<Integer> list = new ArrayList<>();
        Scanner number = new Scanner(System.in);
        System.out.println("How many numbers did you enter?" + number);
        while (number.hasNextInt())
        {
            int i = number.nextInt();
            list.add(i);
        }
        return list;
    }
}
