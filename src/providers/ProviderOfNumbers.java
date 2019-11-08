package providers;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProviderOfNumbers implements NumberProvider {

    @Override
    public List<Integer> provideNumbers() {

        List<Integer> items = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in your numbers.");

        while(scan.hasNext()){
          int x = scan.nextInt();
          items.add(x);
        }
        return items;



    }
}
