package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FromEntryNumberProvider implements NumberProvider{

    @Override


    public List<Integer> provideNumbers() {
        List<Integer> resultingList = new ArrayList<>();
        Scanner Entry = new Scanner(System.in);
        System.out.println("How many numbers?");
        int digitsLong = Entry.nextInt();

        for(int i=1; i<=digitsLong; i++){
            System.out.println("Type Number");
            int digitsContained = Entry.nextInt();
            resultingList.add(digitsContained);
        }

        return resultingList;
    }
}


