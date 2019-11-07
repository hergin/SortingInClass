package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleProvider implements NumberProvider {

    private long seed;
    public ConsoleProvider(long seed) {
        this.seed = seed;
    }

    @Override
    public List<Integer> provideNumbers()
    {
        Scanner console = new Scanner(System.in);
        List<Integer> Items = new ArrayList<>();
        System.out.println("How many numbers are in your list?: ");
        int listSize = console.nextInt();
        while(listSize>0)
        {
            Items.add(console.nextInt());
            listSize-=1;
        }
        return Items;
    }
}
