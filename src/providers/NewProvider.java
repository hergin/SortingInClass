package providers;

import java.io.Console;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewProvider implements NumberProvider {
    private List<Integer> Numberinput;
    private String Number;
    private String nextNumber;
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Integer> provideNumbers() {
        System.out.print("Type Your amount");
        Numberinput = new ArrayList<Integer>();
        Number= scanner.nextLine();
        Integer Amountnumber = Integer.parseInt(Number);
        for (int i =0; i < Amountnumber; i++){
            System.out.print("type your numbers");
            nextNumber = scanner.nextLine();
            Integer newNumber = Integer.parseInt(nextNumber);
            Numberinput.add(newNumber);
        }
         
        return Numberinput;
    }
}
