package providers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CubedHalvedNumberProvider implements NumberProvider {

    private Scanner key;
    private List<Integer> calculatedList;

    @Override
    public List<Integer> provideNumbers() {
        this.input();
        return calculatedList;
    }

    private void input(){
        this.calculatedList = new ArrayList<>();
        this.key = new Scanner(System.in);
        System.out.print("How many Numbers are you going to enter?\n");
        int amt = key.nextInt();
        for(int i=0; i<amt; i++){
            System.out.print("Number "+(i+1)+":\n");
            calculatedList.add(calculate(key.nextInt()));
        }
    }

    private int calculate(int nextInt) {
        return (int) Math.floor((Math.pow(nextInt,3))/2);
    }
}
