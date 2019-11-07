package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CubedHalvedProvider implements NumberProvider {
    @Override
    public List<Integer> provideNumbers() {
        List<Integer> calculatedList = new ArrayList<Integer>();
        Scanner key = new Scanner(System.in);
        System.out.print("How many Numbers are you going to enter?\n");
        int amt = key.nextInt();
        for(int i=0; i<amt; i++){
            System.out.print("Number "+(i+1)+":\n");
            calculatedList.add(calculate(key.nextInt()));
        }
        return calculatedList;
    }

    private int calculate(int nextInt) {
        return Math.floor((nextInt**3)/2);
    }
}
